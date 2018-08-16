public class List<T> implements IList<T> {

    private Element<T> _first = null;
    private Element<T> _last = null;
    private int count = 0;

    @Override
    public void Append(T valor) {
        if (this.count == 0) {
            this.AddFirst(valor);
        } else {
            Element<T> newElement = new Element<>(valor);
            this._first.setNext(newElement);
            newElement.setPrior(this._last);
            this._last = newElement;
            this.count++;
        }
    }

    @Override
    public void AddFirst(T element) {
        if (this.count == 0) {
            Element<T> newElement = new Element<>(element);
            this._first = newElement;
            this._last = newElement;
        } else {
            Element<T> newElement = new Element<>(element, this._first);
            this._first.setPrior(newElement);
            this._first = newElement;
        }

        this.count++;
    }

    @Override
    public void RemoveLast() {
        if (!ValidatePosition(this.count - 1)) {
            System.out.print("Posição inexistente!");
            return;
        }

        if (this.count == 1) {
            this.RemoveFirst();
        }
        else {
            Element<T> prior = this._last.getPrior();
            prior.setNext(null);
            this._last = prior;
            this.count--;
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
            this._last = null;
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

        Element<T> current = this._first;
        for (int i = 0; i < index; i++)
            current = this._first.getNext();

        return current.getCurrent();
    }

    private boolean ValidatePosition(int position) {
        return position >= 0 && position <= this.count;
    }
}
