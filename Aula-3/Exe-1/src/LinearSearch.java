public class LinearSearch {
    public boolean linearSearch(String[] data, String key){
        for (int i = 0; i < data.length; i++){
            if (data[i].equals(key))
                return true;
        }
        return false;
    }

    public boolean linearSearch(String[] data, String key, boolean useComparable)
    {
        if (!useComparable)
            return linearSearch(data, key);

        for (int i = 0; i < data.length; i++){
            if (data[i].compareToIgnoreCase(key) == 0)
                return true;
        }

        return false;
    }
}