package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    void queueCanBeCreatedTest() {
        assertNotNull(queue);
    }

    @Test
    void queueIsEmptyTest() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void queueIsNotEmptyTest() {
        queue.enqueue(26);
        assertFalse(queue.isEmpty());
    }

    @Test
    void queueCanNotPopWithoutPushingTest() {
        assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }

    @Test
    void queueIsEmptyAfterPushingAndPoppingTest() {
        queue.enqueue(99);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void pushTwicePopOnce_QueueIsNotEmpty() {
        queue.enqueue(22);
        queue.enqueue(25);
        queue.dequeue();
        assertFalse(queue.isEmpty());
    }

    @Test
    void pushX_PopX_elementShouldBeXTest() {
        queue.enqueue(90);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void pushXandY_popXandY_elementsIsXthenXTest() {
        queue.enqueue(34);
        queue.enqueue(67);
        int element = queue.dequeue();

        assertEquals(34, element);
        assertEquals(67, queue.peek());
        element = queue.dequeue();
        assertEquals(67, element);
    }

    @Test
    void pushXandY_peekReturnsXTest() {
        queue.enqueue(99);
        queue.enqueue(71);
        queue.enqueue(67);

        int element = queue.peek();
        assertEquals(99, element);

        element = queue.dequeue();
        assertEquals(99, element);

        element = queue.peek();
        assertEquals(71, element);
    }

    @Test
    void queueSizeCanBeGottenTest() {
        queue.enqueue(99);
        queue.enqueue(71);
        queue.enqueue(67);

        int size = queue.size();
        assertEquals(3, size);
    }

    @Test
    void queueCanNotExceedMaximumSizeTest() {
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(33);
        queue.enqueue(33);
        queue.enqueue(33);
        queue.enqueue(33);
        assertThrows(FilledUpQueueException.class, () -> queue.enqueue(100));
    }

    @Test
    void canPeekLastElementTest() {
        queue.enqueue(34);
        queue.enqueue(67);
        queue.enqueue(44);
        queue.enqueue(44);
        queue.enqueue(44);
        queue.enqueue(44);
        queue.enqueue(55);
        int element = queue.dequeue();

        assertEquals(34, element);
        assertEquals(55, queue.peekFromBehind());
        element = queue.dequeue();
        assertEquals(67, element);
        assertEquals(55, queue.peekFromBehind());

        element = queue.peek();
        assertEquals(44, element);

        int size = queue.size();
        assertEquals(5, size);
    }
}
