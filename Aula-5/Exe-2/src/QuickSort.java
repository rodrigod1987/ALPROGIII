public class QuickSort<T> {

    public Comparable<T>[] sort(Comparable<T>[] list, int low, int high)
    {
        if (low < high) {
            int partitioned = partition(list, low, high);
            sort(list, low, partitioned-1);
            sort(list, partitioned+1, high);
        }
        return list;
    }

    private int partition(Comparable<T>[] list, int low, int high) {
        int first = low;
        int last = low;
        T pivo = (T)list[high-1];

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i].compareTo(pivo) > 0)
                last -= 1;
            else {
                first += 1;
                T aux = (T) list[first - 1];
                list[first - 1] = list[i];
                list[i] = (Comparable<T>) aux;
            }
        }
        return first - 1;
    }
}
