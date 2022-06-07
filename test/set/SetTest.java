package set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set set;
    @BeforeEach
    void setUp() {
        set = new Set();
    }

    @Test
    void setCanBeCreatedTest(){
        assertNotNull(set);
    }

    @Test
    void setIsEmptyTest(){
        assertTrue(set.isEmpty());
    }

    @Test
    void setCanTakeElementTest(){
        set.add(20);
        assertFalse(set.isEmpty());
    }

    @Test
    void setCanTakeMultipleElementTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        assertEquals(3, set.size());
    }

    @Test
    void setElementCanBeGottenTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        assertEquals(45, set.get(2));
    }

    @Test
    void setSizeCanBeGottenTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        assertEquals(3, set.size());
    }

    @Test
    void canNotHaveDuplicateElementTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        assertThrows(ElementAlreadyExists.class, () -> set.add(45));
        assertEquals(3, set.size());
    }

    @Test
    void duplicateElementThrowsExceptionTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        assertThrows(ElementAlreadyExists.class, () -> set.add(45));
    }

    @Test
    void toCheckIfElementContainsItemTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        assertTrue(set.contains(45));
    }

    @Test
    void itemCanBeRemovedTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        set.add(33);
        set.remove(3);
        assertEquals(3, set.size());
    }

    @Test
    void setCanBeClearedTest(){
        set.add(23);
        set.add(63);
        set.add(45);
        set.add(33);
        set.clear();
        assertEquals(0, set.size());
    }
}
