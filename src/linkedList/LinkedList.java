package linkedList;

public class LinkedList<T> {
    private Node first;


    public int size() {
        int count = 0;
        Node node = first;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T value) {
        if (isEmpty()) {
            first = new Node(value);
        } else {
            Node node = first;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(value);
        }
    }

    public T get(int index) {
        Node node = first;
        while (index > 0) {
            index--;
            node = node.next;
        }
        return node.value;
    }

    public T remove(int index) {
        Node node = first;
        Node previous = null;
        while (index > 0) {
            index--;
            previous = node;
            node = node.next;
        }
        if (previous == null) {
            first = node.next;
        } else {
            previous.next = node.next;
        }
        return node.value;
    }

    public void add(int position, T value) {
        if (position == 1) {
            add(value);
        }
        Node node = first;
        int count = 1;
        while (count < position - 1) {
            count++;
            node = node.next;
        }
        Node newNode = new Node(value);
        newNode.next = node.next;
        node.next = newNode;
    }

    public boolean search(T value){
        Node node = first;
        while (node != null){
            if (value == node.value){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void display() {
        Node node = first;
        while (node != null) {
            System.out.print(node.value + " --> ");
            node = node.next;
        }
        System.out.println();
    }








    private class Node {
        private final T value;
        private Node next;


        public Node(T value) {
            this.value = value;
        }
    }
}
