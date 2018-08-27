public class BinarySearch {

    public final int NOT_FOUND = -1;

    //Recursive search
    public int binarySearchRecursive(Comparable[] data, Comparable pattern)
    {
        return binarySearch(data, pattern, 0, data.length -1);
    }

    public int binarySearch(Comparable[] data, Comparable pattern, int low, int high) {

        if (low > high)
            return NOT_FOUND;

        int middle = (low + high) / 2;


        if (data[low].compareTo(pattern) < 0)
            return binarySearch(data, pattern, (middle + 1), high);
        else if (data[low].compareTo(pattern) > 0)
            return binarySearch(data, pattern, (middle -1), high);
        else
            return middle;

    }

    //Iterative search
    public int binarySearch(Comparable[] data, Comparable pattern) {

        int low = 0;
        int high = data.length - 1;
        int middle;

        while (low <= high) {

            middle = (low + high) / 2;

            if (data[low].compareTo(pattern) < 0)
                low = middle + 1;
            else if (data[low].compareTo(pattern) > 0)
                low = middle -1;
            else
                return middle;

        }

        return NOT_FOUND;

    }

}
