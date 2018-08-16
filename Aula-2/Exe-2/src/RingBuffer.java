public class RingBuffer implements IBuffer {
    private Object[] _buffer;
    private int _size, _head, _tail;
    private boolean _isFull;


    public RingBuffer(int size) {
        this._buffer = new Object[_size];
        this._size = size;
        this._head = 0;
        this._tail = this._head;
        this._isFull = false;
    }

    @Override
    public void Append(Object element) {
        if (this._isFull)
            this._head = (_head + 1) % this._size;

        this._buffer[this._size] = element;
        this._tail = (this._tail + 1) % this._size;

        if (this._head == this._tail)
            this._isFull = true;
    }

    @Override
    public void Remove(Object element) {
        if (!this.IsEmpty())
        {
            this._head = (this._head + 1) % this._size;
            this._isFull = false;
        }
    }

    @Override
    public boolean IsEmpty() {
        return !this._isFull && (this._head == this._tail);
    }
}
