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
    void hashMapCanBeCreatedTest(){
        assertNotNull(hashMap);
    }

    @Test
    void hashMapIsEmptyOnCreationTest(){
        assertTrue(hashMap.isEmpty());
    }

    @Test
    void hashMapCanHaveKeyTest(){
        hashMap.put("car");
        hashMap.put("dog");
        hashMap.put("ball");
        hashMap.put("mat");
        assertEquals("ball", hashMap.getKey(2));
    }
}
