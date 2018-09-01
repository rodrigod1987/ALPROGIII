public interface IStack<T> {
    void Insert(T element);
    void Remove(T element);
    boolean IsEmpty();
}
