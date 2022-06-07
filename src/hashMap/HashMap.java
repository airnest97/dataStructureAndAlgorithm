package hashMap;


import list.ArrayList;
import set.Set;


public class HashMap {

    private final Set keys;
    private final ArrayList values;

    public HashMap() {
        keys = new Set();
        values = new ArrayList();
    }

    public boolean isEmpty() {
        return keys.isEmpty();
    }

    public void put(int key, String value) {
        if (!keys.contains(key)) {
            //create
            keys.add(key);
            values.add(value);
        } else {
            //update
                int index = keys.getIndex(key);//(key) // returns index of the element found
                values.remove(index);
                values.add(index, value);

        }

    }

    public int size() {
        return keys.size();
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
    }

    public boolean removeValueByKey(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (key == keys.get(i)) {
                removeKey(key);
            }
            for (int j = 0; j < values.size(); j++) {
                values.remove(i);
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

    public void removeKey(int index) {
        for (int i = 0; i < keys.size(); i++) {
            if (index == keys.get(i))
                keys.removeObject(index);
        }
    }
}
