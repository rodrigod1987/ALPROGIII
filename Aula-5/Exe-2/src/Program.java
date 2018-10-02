public class Program {

    public static void main(String[] args)
    {
        runInteger();
        runString();
    }

    private static void runString() {
        Comparable<String>[] list = new String[]{"Rodrigo Duarte", "Maria Joana", "Lucas Antonio", "Alexandre Silveira"};

        String[] elements = (String[])list;

        for (String item : elements) {
            System.out.println("Item: "+item);
        }

        System.out.println();

        QuickSort<String> q = new QuickSort<>();
        list = q.sort(list, 0, list.length - 1);

        elements = (String[])list;

        for (String item : elements) {
            System.out.println("Item: "+item);
        }
    }

    private static void runInteger() {
        Comparable<Integer>[] list = new Integer[]{8,5,12,55,3,7,82,44,35,25,41,29,17};

        Integer[] elements = (Integer[])list;

        for (Integer item : elements) {
            System.out.println("Item: "+item);
        }

        System.out.println();

        QuickSort<Integer> q = new QuickSort<>();
        list = q.sort(list, 0, list.length - 1);

        elements = (Integer[])list;

        for (Integer item : elements) {
            System.out.println("Item: "+item);
        }
    }

}
