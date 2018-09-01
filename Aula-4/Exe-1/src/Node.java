public class Node<T> implements INode<T> {
    private T _node;
    private Node<T> _nextNode;

    public Node(T element) {
        this._node = element;
        this._nextNode = null;
    }

    public Node(Node<T> next, T element) {
        this._node = element;
        this._nextNode = next;
    }

    public T getNode() { return this._node; }
    public Node<T> getNext() { return this._nextNode; }

    public void setNext(Node<T> valor) { this._nextNode = valor; }

    @Override
    public boolean equals(Object key) {
        if (this._node.equals(key))
            return true;

        return false;
    }
}
