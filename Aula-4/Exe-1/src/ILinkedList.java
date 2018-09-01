public interface ILinkedList<T> {
    void Append(T valor); // adiciona um elemento no final da lista.
    void AddFirst(T valor); // adiciona um elemento no inicio da lista.
    void RemoveLast(); // remove o último elemento da lista.
    void RemoveFirst(); // remove o primeiro elemento da lista.
    int Size(); // retorna o número de elementos na lista.
    T Get(int index); //retorna o elemento com o indice indicado.
    Node<T> search(Object key);
}