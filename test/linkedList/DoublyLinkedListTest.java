package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    DLinkedList<Integer> dLinkedList;
    @BeforeEach
    void setUp() {
        dLinkedList = new DLinkedList<>();
    }

    @Test
    void doublyLinkedListCanBeCrestedTest(){
        assertNotNull(dLinkedList);
    }

    @Test
    void itShouldAppendTheItemAtTheEndOfTheListTest(){
        dLinkedList.addToLast(1000);
        assertEquals(1, dLinkedList.size());
    }

    @Test
    void itShouldAppendTheItemAtTheFrontOfTheListTest(){
        dLinkedList.addToLast(1000);
        dLinkedList.addToFront(2000);
        assertEquals(2, dLinkedList.size());
    }

    @Test
    void checkThatFrontElementIsAtFrontTest(){
        dLinkedList.addToLast(1000);
        dLinkedList.addToFront(2000);

        DLinkedList.Node<Integer> front = dLinkedList.front();
        assertEquals(2, dLinkedList.size());
        assertEquals(2000, front.getData());
    }

    @Test
    void checkThatLastElementIsAtLastPositionTest(){
        dLinkedList.addToLast(1000);
        dLinkedList.addToFront(2000);

        DLinkedList.Node<Integer> front = dLinkedList.front();
        assertEquals(2, dLinkedList.size());
        assertEquals(1000, front.getNext().getData());
    }

    @Test
    void nodePreviousToTheGivenNodeIsReturnedTest(){
        dLinkedList.addToLast(1000);
        dLinkedList.addToFront(500);

        assertEquals(500, dLinkedList.previous(1000, 0));
    }

    @Test
    void itShouldRemoveTheNodeFrontListTest(){
        dLinkedList.addToLast(1000);
        dLinkedList.addToFront(500);

        dLinkedList.remove(500);
        assertEquals(1000, dLinkedList.front().getData());
    }

    @Test
    void itShouldBeNullWhenAllNodeAreRemovedFromListTest(){
        dLinkedList.addToLast(1000);
        dLinkedList.addToFront(500);

        dLinkedList.remove(500);
        dLinkedList.remove(1000);
        assertNull(dLinkedList.front());
    }
}
