import java.util.Arrays;

public class Program {

    public static void main(String[] args)
    {
        runInteger();
        System.out.println();
        runString();
    }

    private static void runString() {
        Comparable<String>[] list = new String[]{"Rodrigo Duarte", "Maria Joana", "Lucas Antonio", "Alexandre Silveira"};

        String[] elements = (String[])list;
        System.out.println(String.join(",", elements));

        System.out.println();

        QuickSort<String> q = new QuickSort<>();
        list = q.sort(list, 0, list.length - 1);

        elements = (String[])list;
        System.out.println(String.join(",", elements));
    }

    private static void runInteger() {
        Comparable<Integer>[] list = new Integer[]{8,5,12,55,3,7,82,44,35,25,41,29,17};

        Integer[] elements = (Integer[])list;
        System.out.println(String.join(",", Arrays.toString(elements)));

        System.out.println();

        QuickSort<Integer> q = new QuickSort<>();
        list = q.sort(list, 0, list.length - 1);

        elements = (Integer[])list;
        System.out.println(String.join(",", Arrays.toString(elements)));
    }

}
