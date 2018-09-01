public interface INode<T> {

    T getNode();
    Node<T> getNext();
    void setNext(Node<T> valor);

}
