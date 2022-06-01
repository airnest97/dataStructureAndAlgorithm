package hashMap;


import list.ArrayList;
import set.Set;


public class HashMap {
    private int sizeOfHashMap;
    private Set keys;
    private ArrayList values;

    public HashMap() {
        keys = new Set();
        values = new ArrayList();
    }

    public boolean isEmpty() {
        return sizeOfHashMap == 0;
    }

    public void put(int key, String value) {
        keys.add(key);
        values.add(value);
        sizeOfHashMap++;
    }

    public int size() {
        return sizeOfHashMap;
    }

    public int containKey(int key) {
        int number = 0;
        for (int i = 0; i < keys.size(); i++) {
            if (key == i)
                number = keys.get(i);
        }
        return number;
    }

    public String containValue(int index) {
        String value = null;
        for (int i = 0; i < values.size(); i++) {
            if (index == i)
                value = values.get(i);
        }
        return value;
    }

    public void clear() {
        keys.clear();
        values.clear();
        sizeOfHashMap = 0;
    }

    public boolean removeByKey(int key) {
        int element;
        for (int i = 0; i < keys.size(); i++) {
            if (key == i) {
//              removeByKey(i);
//                element = keys.get(i);
//                keys.removeByIndex(element);
            }
            for (int j = 0; j < values.size(); j++) {
                values.remove(i);
                sizeOfHashMap--;
                return true;
            }
        }
        return false;
    }

    public String get(int key) {
        String value;
        for (int i = 0; i < keys.size(); i++) {
            if (key == keys.get(i))
                for (int j = 0; j < values.size(); j++) {
                    value = values.get(i);
                    return value;
                }
        }
        return null;
    }

    public boolean removeKey(int index) {
        for (int i = 0; i < keys.size(); i++) {
            if (index == i) {
                int key = keys.get(i);
                keys.remove(key);
                return true;
            }
        }
        return false;
    }
}
