public class QuickSort<T> {

    public Comparable<T>[] sort(Comparable<T>[] list, int low, int high)
    {
        if (low < high) {
            int index = partition(list, low, high);
            sort(list, low, index -1);
            sort(list, index + 1, high);
        }
        return list;
    }

    private int partition(Comparable<T>[] list, int start, int end) {
        T pivot = (T)list[end];
        int first = start-1;


        for (int i = start; i < list.length - 1; i++) {
            if (list[i].compareTo(pivot) < 0) {
                first += 1;
                swap(list, first, i);
            }
        }

        T element = (T)list[first+1];
        if (list[end].compareTo(element) < 0)
            swap(list, first+1, end);

        return first + 1;
    }

    private void swap(Comparable<T>[] list, int first, int i) {
        T aux = (T) list[first];
        list[first] = list[i];
        list[i] = (Comparable<T>) aux;
    }
}
