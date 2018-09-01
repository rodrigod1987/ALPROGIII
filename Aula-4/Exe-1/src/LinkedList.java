public class LinkedList<T> implements ILinkedList<T> {

    private Node<T> _first = null;
    private Node<T> _current = null;
    private int count = 0;

    @Override
    public void Append(T valor) {
        if (this.count == 0) {
            this.AddFirst(valor);
        } else {
            Node<T> newElement = new Node<T>(valor);
            this._current.setNext(newElement);
            this._current = newElement;
            this.count++;
        }
    }

    @Override
    public void AddFirst(T valor) {
        Node<T> newElement = new Node<T>(valor);
        this._first = newElement;

        if (this.count == 0)
            this._current = this._first;

        this.count++;
    }

    @Override
    public void RemoveLast() {
        Node<T> current = this._first;
        if (current.getNext() == null) {
            this.RemoveFirst();
            return;
        }


        for (int i = 0; i < this.count; i++) {
            current = current.getNext();
            if (current.getNext() == this._current) {
                current.setNext(null);
                this._current = current;
                this.count--;
            }
        }
    }

    @Override
    public void RemoveFirst() {
        if (!ValidatePosition(0)) {
            System.out.print("Posição inexistente!");
            return;
        }

        this._first = this._first.getNext();
        this.count--;

        if (this.count == 0)
            this._current = null;
    }

    @Override
    public int Size() {
        return this.count;
    }

    @Override
    public T Get(int index) {
        if (!ValidatePosition(index))
        {
            System.out.print("Posição inexistente!");
            return null;
        }

        Node<T> current = this._first;
        for (int i = 0; i < index; i++)
            current = this._first.getNext();

        return current.getNode();
    }

    private boolean ValidatePosition(int position) {
        return position >= 0 && position <= this.count;
    }

    public Node<T> search(Object key) {
        return search(key, _first);
    }

    private Node<T> search(Object key, Node<T> nodo) {

        if (nodo.getNext() != null) {
            if (nodo.equals(key)) return nodo;
            else search(key, nodo.getNext());
        }

        return null;
    }
}
