public class Element<T> {
    private T _element;
    private Element<T> _next;

    public Element(T element) {
        this._element = element;
        this._next = null;
    }

    public Element(Element<T> next, T element) {
        this._element = element;
        this._next = next;
    }

    public T getElement() { return this._element; }
    public Element<T> getNext() { return this._next; }

    public void setNext(Element<T> valor) { this._next = valor; }
}
