public interface IHeap<T> {
    void Insert(T element);
    T Remove();
    boolean IsEmpty();
    void Invert();
}
