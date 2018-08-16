public class Heap<T> implements IHeap<T> {

    private List<T> _list;

    public Heap()
    {
        _list = new List<>();
    }

    @Override
    public void Insert(T element) {
        _list.Append(element);
    }

    @Override
    public void Remove(T element) {
        if (this.IsEmpty())
            System.out.print("A pilha está vazia!");

        _list.RemoveLast();
    }

    @Override
    public boolean IsEmpty() {
        return _list.Size() == 0;
    }
}
