public class LinearSearch {

    public boolean linearSearch(String[] data, String key){
        for (int i = 0; i < data.length; i++){
            if (data[i].equals(key))
                return true;
        }
        return false;
    }

    public boolean linearSearch(Comparable[] data, String key)
    {
        for (int i = 0; i < data.length - 1; i++){
            if (data[i].compareTo(key) == 0)
                return true;
        }

        return false;
    }
}