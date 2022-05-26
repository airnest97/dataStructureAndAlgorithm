package customArrayList;

import java.util.Objects;

public class CustomArrayList {
    private int counter;
    private int length;
    private String[] array;

    public void add(String item) {
        if (counter == 0){
            length = 5;
            array = new String[length];
        }
        if (counter == length) {
            increaseArrayLength();
            array[counter] = item;
            counter++;
        }
        else {
            array[counter] = item;
            counter++;
        }
    }

    public String get(int index) {
        return array[index];
    }

    public void remove(int index) {
        for (int i = 0; i < length - 1; i++) {
            if (i == index)
                removeElement(i);
        }
    }

    public void remove(String item){
        for (int i = 0; i < length - 1; i++) {
            if (item.equals(array[i])) {
                removeElement(i);
            }
        }
    }

    public void add(int index, String item) {
        if (index < counter) {
            if (counter < length) {
                addElement(index, item);
                counter++;
            } else if (counter == length) {
                increaseArrayLength();
                addElement(index, item);
                counter++;
            }
        }
    }

    public int size() {
        return counter;
    }

    private void addElement(int index, String item) {
        String[] newArray = new String[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        array[index] = item;
        for (int i = index; i < length - 1; i++) {
            array[i + 1] = newArray[i];
        }
    }

    private void increaseArrayLength() {
        length = length * 2;
        String[] newArray = new String[length];
        for (int i = 0; i < counter; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private void removeElement(int i) {
        array[i] = null;
        counter--;
        for (int j = i; j < length - 1; j++) {
            array[j] = array[j + 1];
        }
    }

    public boolean contains(String element) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(element, array[i]))
                return  true;
        }
        return false;
    }
}
