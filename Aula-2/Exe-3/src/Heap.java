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
    public T Remove() {
        if (this.IsEmpty()) {
            System.out.print("A pilha está vazia!");
            return null;
        }

        T result = _list.Get(_list.Size());
        _list.RemoveLast();

        return result;
    }

    @Override
    public void Invert()
    {
        if (this.IsEmpty()) {
            System.out.print("A pilha está vazia!");
            return;
        }

        List<T> aux = new List<>();

        for (int i = 0; i < _list.Size(); i++)
            aux.Append(this.Remove());


        for (int i = 0; i < aux.Size(); i++){
            T element = aux.Get(aux.Size());
            aux.RemoveLast();
            this.Insert(element);
        }
    }

    @Override
    public boolean IsEmpty() {
        return _list.Size() == 0;
    }
}
