public class Program {

    public static void main(String[] args)
    {
        Comparable<Integer>[] list = new Integer[]{8,5,12,55,3,7,82,44,35,25,41,29,17};

        System.out.println("["+String.join(",", list.toString())+"]");

        QuickSort<Integer> q = new QuickSort<>();
        list = q.sort(list, 0, list.length);

        System.out.println("["+String.join(",", list.toString())+"]");
    }

}
