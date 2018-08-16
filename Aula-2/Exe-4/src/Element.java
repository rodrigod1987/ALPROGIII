public class Element<T> {
    private T _current;
    private Element<T> _next;
    private Element<T> _prior;

    public Element(T element) {
        this._current = element;
        this._next = null;
        this._prior = null;
    }

    public Element(T element, Element<T> next) {
        this._current = element;
        this._next = next;
        this._prior = null;
    }

    public T getCurrent() { return this._current; }
    public Element<T> getNext() { return this._next; }
    public Element<T> getPrior() { return this._prior; }

    public void setNext(Element<T> value) { this._next = value; }
    public void setPrior(Element<T> value) { this._prior = value; }
}
