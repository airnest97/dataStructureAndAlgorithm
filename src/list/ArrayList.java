package list;

public class ArrayList implements List {
    private int counter;
    private int length;
    private String[] db;

    @Override
    public void add(String item) {
        if (counter == 0) {
            length = 5;
            db = new String[length];
        }
        if (counter == length) {
            increaseArrayLength();
        }
        db[counter] = item;
        counter++;
    }

    @Override
    public void add(int index, String item) {
        if (index < counter) {
            if (counter < length) {
                implementAdd(index, item);
                counter++;
            } else if (counter == length) {
                increaseArrayLength();
                implementAdd(index, item);
                counter++;
            }
        }
    }

    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public void remove(String item) {
        for (int i = 0; i < length - 1; i++) {
            if (item.equals(db[i])) {
                implementRemoval(i);
            }
        }
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < length - 1; i++) {
            if (i == index) {
              implementRemoval(i);
            }
        }
    }

    @Override
    public int size() {
        return counter;
    }

    private void increaseArrayLength() {
        length = length * 2;
        String[] db2 = new String[length];
        for (int i = 0; i < counter; i++) {
            db2[i] = db[i];
        }
        db = db2;
    }

    private void implementAdd(int index, String item) {
        String[] db1 = new String[length];
        for (int i = 0; i < length; i++) {
            db1[i] = db[i];
        }
        db[index] = item;
        for (int i = index; i < length - 1; i++) {
            db[i + 1] = db1[i];
        }
    }

    private void implementRemoval(int i) {
        db[i] = null;
        counter--;
        for (int j = i; j < length - 1; j++) {
            db[j] = db[j + 1];
        }
    }

    public void clear() {
        for (int i = 0; i < length; i++) {
            db[i] = null;
        }
    }
}
