package queue;


import java.util.Arrays;

public class Queue {
    private int sizeOfQueue;
    private final int[] elements;
    private int lastElementIn = -1;
    private int firstElementIn = -1;


    public Queue() {
        elements = new int[10];
    }


    public boolean isEmpty() {
        return sizeOfQueue == 0;
    }

    public void enqueue(int element) {
        if (isFull()) throw new FilledUpQueueException("Queue is full");

        else {
            lastElementIn = (lastElementIn + 1) % elements.length;
            elements[lastElementIn] = element;
            sizeOfQueue++;
            boolean isNotFilled = firstElementIn == -1;
            if (isNotFilled){
                firstElementIn = lastElementIn;
            }
        }
    }


    public int dequeue() {
        int number;
        if (isEmpty()) throw new EmptyQueueException("Queue is empty");

        else {
            number = elements[firstElementIn];
            elements[firstElementIn] = 0;
            firstElementIn = (firstElementIn + 1) % elements.length;
            sizeOfQueue--;
        }
        return number;
    }

    public int peek() {
        int element = 0;
        if (!isEmpty()) {
            element = elements[firstElementIn];
        }
        return element;
    }

    public int size() {
        return sizeOfQueue;
    }

    public int peekFromBehind() {
        int element;
        element = elements[elements.length - 1];
        if (isFull()) element = elements[firstElementIn - 1];
        return element;
    }

    public boolean isFull() {
        return sizeOfQueue == elements.length;
    }

    public void display() {
        System.out.println(Arrays.toString(elements));
    }
}
