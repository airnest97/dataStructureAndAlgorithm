package set;

import java.util.ArrayList;
import java.util.Objects;

public class Set {
    private final ArrayList<Integer> elements;


    public Set() {
        elements = new ArrayList<>();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void add(int element) {
        if (!elements.contains(element)) {
            elements.add(element);
        } else
            throw new ElementAlreadyExists("Item already Exist");
    }

    public int size() {
        return elements.size();
    }

    public int get(int index) {
        return elements.get(index);
    }

    public boolean contains(int element) {
        for (Integer integer : elements) {
            if (element == integer) {
                return true;
            }
        }
        return false;
    }

    public void remove(Integer element) {
        for (int i = 0; i < elements.size(); i++) {
                elements.remove(element);
        }
    }

    public void clear() {
        elements.clear();
    }
}
