import java.util.function.Predicate;

public class BubbleSort<T> {

    public T[] sort(T[] objects, Predicate<T> predicate){

        boolean sorted = false;

        while(!sorted) {
            sorted = true;

            for (int i = 0; i < objects.length; i++) {
                if (predicate.test(objects[i])) {
                    swap(objects, i);
                    sorted = false;
                }

                if (sorted)
                    break;
            }
        }

        return objects;
    }

    private void swap(T[] objects, int i) {
        T temp = objects[i];
        objects[i] = objects[i + 1];
        objects[i + 1] = temp;
    }
}
