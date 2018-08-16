public interface IHeap<T> {
    void Insert(T element);
    void Remove(T element);
    boolean IsEmpty();
}
