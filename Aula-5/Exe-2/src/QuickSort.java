public class QuickSort<T> {

    public Comparable<T>[] sort(Comparable<T>[] list, int low, int high)
    {
        if (low < high) {
            int index = partition(list, low, high);
            sort(list, low, index);
            sort(list, index+1, high);
        }
        return list;
    }

    private int partition(Comparable<T>[] list, int start, int end) {
        int first = start;
        int last = start;
        T pivo = (T)list[end-1];

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i].compareTo(pivo) > 0)
                last -= 1;
            else {
                last -= 1;
                first += 1;
                T aux = (T) list[first - 1];
                list[first - 1] = list[i];
                list[i] = (Comparable<T>) aux;
            }
        }
        return first - 1;
    }
}
