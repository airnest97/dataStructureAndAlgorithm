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
        assertEquals(1, dLinkedList.size());
    }

    @Test
    void itShouldBeNullWhenAllNodeAreRemovedFromListTest(){
        dLinkedList.addToFront(500);
        dLinkedList.addToLast(1000);

        dLinkedList.remove(500);
        dLinkedList.remove(1000);
        assertNull(dLinkedList.front());
    }

    @Test
    void elementCanBeGottenInA_LinkedListTest(){
        dLinkedList.addToFront(500);
        dLinkedList.addToLast(5600);
        dLinkedList.addToLast(5300);
        dLinkedList.addToLast(5900);
        dLinkedList.addToFront(400);

        assertEquals(5600, dLinkedList.get(2));
    }

    @Test
    void elementCanBeAddedBetweenA_LinkedListTest(){
        dLinkedList.addToFront(500);
        dLinkedList.addToLast(5600);
        dLinkedList.addToLast(5300);
        dLinkedList.addToLast(5900);
        dLinkedList.addToFront(400);
        dLinkedList.addBetween(3, 3900);

        assertEquals(3900, dLinkedList.get(2));
    }

    @Test
    void searchIfA_ValueIsPresentInA_LinkedListTest(){
        dLinkedList.addToFront(500);
        dLinkedList.addToLast(5600);
        dLinkedList.addToLast(5300);
        dLinkedList.addToLast(5900);
        dLinkedList.addToFront(400);
        dLinkedList.addBetween(3, 3900);

        assertTrue(dLinkedList.search(400));
    }
}
