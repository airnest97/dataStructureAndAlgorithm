package hashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        assertEquals(true, hashMap.containKey(200));
    }

    @Test
    void hashMapContainsValueTest() {
        hashMap.put(100, "boy");
        hashMap.put(200, "girl");
        hashMap.put(300, "man");
        hashMap.put(400, "lady");
        assertEquals(true, hashMap.containValue("girl"));
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
        hashMap.removeKey(200);
        assertEquals(3, hashMap.size());
        assertEquals(false, hashMap.containKey(200));
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
        assertTrue(hashMap.containValue("lady"));
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
        hashMap.removeKey(200);
        assertFalse(hashMap.containKey(200));
        assertFalse(hashMap.containValue("girl"));
        assertEquals(5, hashMap.size());
    }
}
