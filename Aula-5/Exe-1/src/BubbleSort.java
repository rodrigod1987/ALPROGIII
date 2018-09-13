import java.util.Comparator;

public class BubbleSort<T> {

    public void sort(T[] objects, Comparator<T> comparator){
        for (int i = 0; i < objects.length; i++) {
            boolean sorted = true;
            for(int j = 0; j < objects.length - 1; j++) {
                if (comparator.compare(objects[j], objects[j + 1]) > 0) {
                    swap(objects, j);
                    sorted = false;
                }
            }

            if (sorted)
                break;
        }
    }

    public void sort(T[] objects)
    {
        for (int i = 0; i < objects.length; i++) {
            boolean sorted = true;
            for(int j = 0; j < objects.length - 1; j++) {
                Comparable<T> comparable = (Comparable<T>) objects[i];
                if (comparable.compareTo(objects[j + 1]) > 0) {
                    swap(objects, j);
                    sorted = false;
                }
            }

            if (sorted)
                break;
        }
    }

    private void swap(T[] objects, int j) {
        T maior = objects[j];
        objects[j] = objects[j + 1];
        objects[j + 1] = maior;
    }
}
