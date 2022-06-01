package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList<String> linkedList;

    @BeforeEach
    void setUp() {
        linkedList =new LinkedList<>();
    }

    @Test
    void linkedListCanBeCreatedTest(){
        assertNotNull(linkedList);
    }

    @Test
    void initialListIsEmptyTest(){
        assertEquals(0, linkedList.size());
    }

    @Test
    void linkedListIsEmptyTest(){
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void sizeIsOneAfterAddingTest(){
        linkedList.add("boy");
        assertEquals(1, linkedList.size());
    }

    @Test
    void canGetElementFromLinkedListTest(){
        linkedList.add("boy");
        String result = linkedList.get(0);
        assertEquals("boy", result);
    }

    @Test
    void canAddMoreThanOneElementTest(){
        linkedList.add("boy");
        linkedList.add("girl");
        assertEquals(2, linkedList.size());
    }

    @Test
    void firstShouldNotChangeTest(){
        linkedList.add("boy");
        linkedList.add("girl");
        linkedList.add("man");
        linkedList.add("game");
        String result = linkedList.get(0);
        assertEquals("boy", result);
    }

    @Test
    void canGetSecondElementFromLinkedListTest(){
        linkedList.add("boy");
        linkedList.add("girl");
        linkedList.add("man");
        linkedList.add("game");
        String result = linkedList.get(1);
        assertEquals("girl", result);
    }

    @Test
    void canRemoveElementFromLinkedListTest(){
        linkedList.add("boy");
        linkedList.add("girl");
        linkedList.add("man");
        linkedList.add("game");
        String result = linkedList.remove(0);
        assertEquals("boy", result);
    }

    @Test
    void testRemoveAndSizeDecrease(){
        linkedList.add("boy");
        linkedList.add("girl");
        linkedList.add("man");
        linkedList.add("game");
        linkedList.remove(0);
        assertEquals(3, linkedList.size());
    }
    @Test
    void firstElementIsNotPresentInTheLinkedListAfterRemovingTest(){
        linkedList.add("boy");
        linkedList.add("girl");
        linkedList.add("man");
        linkedList.add("game");
        linkedList.remove(0);
        assertEquals("girl", linkedList.get(0));
    }

    @Test
    void elementCanBeAddedToAnyPositionInLinkedListTest(){
        linkedList.add("boy");
        linkedList.add("girl");
        linkedList.add("man");
        linkedList.add("game");
        linkedList.add(3, "police");
        assertEquals(5, linkedList.size());
        assertEquals("police", linkedList.get(2));
    }


    @Test
    void searchIfA_ValueIsPresentInALinkedListTest(){
        linkedList.add("boy");
        linkedList.add("girl");
        linkedList.add("man");
        linkedList.add("game");
        assertTrue(linkedList.search("man"));
    }

// ("what happens if i have null value, or try to get negative third element, also attempt removing the last value");
}
