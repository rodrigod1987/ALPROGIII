public class Stack<T> implements IStack<T> {

    private LinkedList<T> _list;

    public Stack()
    {
        _list = new LinkedList<>();
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
