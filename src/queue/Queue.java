package queue;


public class Queue {
    private int sizeOfQueue;
    private final int[] elements;
    private int lastElementIn = -1;
    private int firstElementIn = -1;

    public Queue() {
        elements = new int[7];
    }

    public boolean isEmpty() {
        return sizeOfQueue == 0;
    }

    public void enqueue(int element) {
        if (lastElementIn != elements.length - 1) {
            lastElementIn++;
            elements[lastElementIn] = element;
            sizeOfQueue++;
        }
        else
            throw new FilledUpQueueException("Queue is full");
        }


    public int dequeue() {
        if (sizeOfQueue == 0) {
            throw new EmptyQueueException("Queue is empty");
        }
        firstElementIn++;
        int number = elements[firstElementIn];
        sizeOfQueue--;
        return number;
    }

    public int peek() {
        int element = 0;
        if (!isEmpty()) {
            element = elements[firstElementIn + 1];
        }
        return element;
    }



    public int size() {
        return sizeOfQueue;
    }

    public int peekFromBehind() {
        int element = 0;
        if (!isEmpty()){
            element = elements[elements.length - 1];
        }
        return element;
    }
}
