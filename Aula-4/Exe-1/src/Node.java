public class Node<T> {
    private T _element;
    private Node<T> _next;

    public Node(T element) {
        this._element = element;
        this._next = null;
    }

    public Node(Node<T> next, T element) {
        this._element = element;
        this._next = next;
    }

    public T getNode() { return this._element; }
    public Node<T> getNext() { return this._next; }

    public void setNext(Node<T> valor) { this._next = valor; }
}
