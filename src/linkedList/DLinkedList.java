package linkedList;

public class DLinkedList<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;


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
            return;
        }

        if (tail.getData().equals(data)){
            tail = tail.getPrevious();
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
        }
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









