package customArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertNotNull;

public class CustomArrayListTest {
    private CustomArrayList arrayList;

    @BeforeEach
    void setUp() {
        arrayList = new CustomArrayList();
    }

    @Test
    void arrayListExistTest(){
        CustomArrayList arrayList = new CustomArrayList();
        assertNotNull(arrayList);
    }

    @Test
    void addTest(){
        arrayList.add("Boy");
        assertEquals(1, arrayList.size());
    }

    @Test
    void addAndGetTest(){
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("man");
        arrayList.add("lady");
        assertEquals("boy", arrayList.get(0));
    }

    @Test
    void removeTest(){
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("man");
        arrayList.add("lady");
        arrayList.remove(0);
        assertEquals(3, arrayList.size());
    }

    @Test
    void removeByItemTest(){
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("man");
        arrayList.add("lady");
        arrayList.remove("boy");
        assertEquals(3, arrayList.size());
    }

    @Test
    void canAddByIndexTest(){
        arrayList.add("cars");
        arrayList.add("mood swing");
        arrayList.add("Money");
        arrayList.add("Aja for boyfriend");
        assertEquals(4,arrayList.size());
        assertEquals("Money",arrayList.get(2));

        arrayList.add(2,"food is good");
        assertEquals("food is good",arrayList.get(2));
        assertEquals("Money",arrayList.get(3));

        assertEquals(5,arrayList.size());
    }

    @Test
    void canExpandArraySizeWhileAddingMoreItemsTest(){
        arrayList.add("cars");
        arrayList.add("mood swing");
        arrayList.add("Money");
        arrayList.add("boyfriend");
        arrayList.add("boyfriend");
        arrayList.add("boyfriend");
        arrayList.add("boyfriend");
        arrayList.add("boyfriend");
        arrayList.add("boyfriend");
        assertEquals(9, arrayList.size());
    }

    @Test
    void canExpandArraySizeAndRemoveItemsTest(){
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("male");
        arrayList.add("female");
        arrayList.add("man");
        arrayList.add("woman");
        arrayList.add("games");
        arrayList.remove("male");
        assertEquals("female", arrayList.get(2));
        assertEquals("man", arrayList.get(3));
        assertEquals(6, arrayList.size());
    }

    @Test
    void canExpandArraySizeAndRemoveItemsByIndexTest(){
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("male");
        arrayList.add("female");
        arrayList.add("man");
        arrayList.add("woman");
        arrayList.add("games");
        arrayList.remove(2);
        assertEquals("female", arrayList.get(2));
        assertEquals("man", arrayList.get(3));
        assertEquals(6, arrayList.size());
    }

    @Test
    void arrayListCanExpandMoreThanTenElementTest(){
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("male");
        arrayList.add("female");
        arrayList.add("man");
        arrayList.add("woman");
        arrayList.add("games");
        arrayList.add("games");
        arrayList.add("games");
        arrayList.add("games");
        arrayList.add("games");
        arrayList.add("games");
        arrayList.add("games");
        arrayList.add("games");
        arrayList.add("games");
        assertEquals(15, arrayList.size());
    }

    @Test
    void arrayContainsAnElementTest(){
        arrayList.add("boy");
        arrayList.add("girl");
        arrayList.add("male");
        arrayList.add("female");
        arrayList.add("man");
        arrayList.add("woman");
        assertTrue(arrayList.contains("male"));
        assertTrue(arrayList.contains("girl"));
    }
}
