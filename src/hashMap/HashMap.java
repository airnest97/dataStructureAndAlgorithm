package hashMap;

import java.util.ArrayList;

public class HashMap {
    private int sizeOfHashMap;
    private ArrayList<String> key;

    public HashMap() {
        key = new ArrayList<>();
    }

    public boolean isEmpty() {
        return sizeOfHashMap == 0;
    }

    public void put(String input) {
        for (int i = 0; i < key.size(); i++) {
            key.add(input);
        }
    }


    public String getKey(int index) {
        for (int i = 0; i < key.size(); i++) {
//            if (key.contains(index))
            return key.get(index);
        }
        return null;
    }
}
