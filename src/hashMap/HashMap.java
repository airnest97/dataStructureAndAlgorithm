package hashMap;


import list.ArrayList;
import set.Set;

import java.util.Objects;


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
            keys.add(key);
            values.add(value);
        } else {
                int index = keys.findIndexOf(key);
                values.remove(index);
                values.add(index, value);
        }

    }

    public int size() {
        return keys.size();
    }

    public boolean containKey(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (key == keys.get(i))
                return true;
        }
        return false;
    }

    public boolean containValue(String value) {
        for (int i = 0; i < values.size(); i++) {
            if (Objects.equals(value, values.get(i)))
                return true;
        }
        return false;
    }

    public void clear() {
        keys.clear();
        values.clear();
    }

    public boolean removeValueByKey(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (key == keys.get(i)) {
                keys.remove(key);
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
        removeValueByKey(index);
    }
}
