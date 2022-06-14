package linkedList;

public class DLinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;


    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addToFront(T data) {
        var newNode = new Node<>(null, data, null);
        if (isEmpty()){
            tail = newNode;
        }else {
            newNode.setNext(head);
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;
    }

    public void addToLast(T data) {
        var newNode = new Node<>(null, data, null);
        if (isEmpty()){
            tail = newNode;
            head = newNode;
        }else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public Node<T> front() {
        return head;
    }

    public T previous(T data, T defaultValue) {
        var temp = head;

        while (temp != null) {
            if (temp.getData().equals(data))
                return temp.getPrevious().getData();
            temp = temp.getNext();
        }
        return defaultValue;
    }

    public void remove(T data) {
        var temp = head;

        if (head.getData().equals(data)){
            head = head.getNext();
            size--;
            return;
        }

        if (tail.getData().equals(data)){
            tail = tail.getPrevious();
            size--;
            return;
        }

        while (temp != null) {
            if (temp.getData().equals(data)){
                var nodePrevious = temp.getPrevious();
                var nodeAfter = temp.getNext();

                nodeAfter.setPrevious(nodePrevious);
                nodePrevious.setNext(nodeAfter);
                break;
            }
            temp = temp.getNext();
            size--;
        }
    }

    public T get(int index){
        Node<T> node = head;
        while (index > 0) {
            index--;
            node = node.next;
        }
        return node.data;
    }

    public void addBetween(int position, T data){
        if (position == 1) {
            addToFront(data);
        }
        Node<T> node = head;
        int count = 1;
        while (count < position - 1) {
            count++;
            node = node.next;
        }
        Node<T> newNode = new Node<>(null, data, null);
        newNode.next = node.next;
        node.next = newNode;
    }

    public void displayForward(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void displayBackward(){
        Node<T> temp = tail;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.previous;
        }
    }

    public boolean search(T data) {
        Node<T> node = head;
        Node<T> node2 = tail;
        while (node != null && node2 != null){
            if (node.getData().equals(data) || node2.getData().equals(data)){
                return true;
            }
            if (node == node2 || node.next == node2){
                return false;
            }
            node = node.next;
            node2 = node2.previous;
        }
        return false;
    }


    public static class Node<T> {
        private Node<T> previous;
        private final T data;
        private Node<T> next;

        public Node(Node<T> previous, T data, Node<T> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}









