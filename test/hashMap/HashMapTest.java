package hashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {
    private HashMap hashMap;

    @BeforeEach
    void setUp() {
        hashMap = new HashMap();
    }

    @Test
    void hashMapCanBeCreatedTest() {
        assertNotNull(hashMap);
    }

    @Test
    void hashMapIsEmptyOnCreationTest() {
        assertTrue(hashMap.isEmpty());
    }

    @Test
    void hashMapCanHaveKeyTest() {
        hashMap.put(100, "boy");
        assertEquals(1, hashMap.size());
    }

    @Test
    void hashMapCanHaveValueTest() {
        hashMap.put(100, "boy");
        assertEquals(1, hashMap.size());
    }

    @Test
    void hashMapContainsKeyTest() {
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        assertEquals(200, hashMap.containKey(1));
    }

    @Test
    void hashMapContainsValueTest() {
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        assertEquals("girl", hashMap.containValue(1));
    }

    @Test
    void hashMapCanBeClearedTest() {
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        hashMap.clear();
        assertEquals(0, hashMap.size());
    }

    @Test
    void keyCanBeRemovedTesting() {
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        hashMap.removeKey(2);
        assertEquals(3, hashMap.size());
        assertEquals(400, hashMap.containKey(2));
    }

    @Test
    void canGetHashMapValueByCorrespondingKeyTest() {
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        assertEquals("lady", hashMap.get(400));
    }

    @Test
    void valueCanBeRemovedTest() {
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        assertTrue(hashMap.removeValueByKey(300));
        assertEquals("lady", hashMap.containValue(2));
        assertEquals(3, hashMap.size());
    }

    @Test
    void keyCanBeRemovedTest(){
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        hashMap.put(500, "days");
        hashMap.put(600, "hype");
        hashMap.removeKey(2);
        assertEquals("boy", hashMap.containValue(0));
        assertEquals(100, hashMap.containKey(0));
    }
}
