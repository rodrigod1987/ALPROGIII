import java.util.Comparator;

public class BubbleSort implements Comparator {

    public void sort(int[] objects){
        for (int i = 0; i < objects.length; i++) {
            boolean sorted = true;
            for(int j = 0; j < objects.length - 1; j++) {
                if (compare(objects[j], objects[j + 1]) > 0) {
                    int maior = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = maior;
                    sorted = false;
                }
            }

            if (sorted)
                break;
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        if ((int)o1 > (int)o2) return 1;
        else return 0;
    }
}
