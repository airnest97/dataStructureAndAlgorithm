package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {
    @Test
    public void addTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        assertEquals(1,list.size());
    }

    @Test
    public void addAndGetTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.add("Food for boyfriend");
        list.add("Money for boyfriend");
        assertEquals("Boxer for boyfriend",list.get(0));
    }

    @Test
    public void removeTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.add("Fish as meal");
        list.remove(1);
        assertEquals(1,list.size());
    }

    @Test
    public void removeByItemTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.add("Fish as meal");
        list.remove("Boxer for boyfriend");
        assertEquals(1,list.size());
    }

    @Test
    public void canExpandArraySizeAndAddMoreItemsTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.add("Food for boyfriend");
        list.add("Money for boyfriend");
        list.add("Laptop for me");
        list.add("Car for mummy");
        assertEquals(5,list.size());
        list.add("Pocket money for sister");
        list.add("Kulikuli for garri");
        list.add("Car for daddy");
        assertEquals(8,list.size());
    }

    @Test
    public void canExpandArraySize_And_AddMoreItemsByIndexTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.add("Food for boyfriend");
        list.add("Money for boyfriend");
        list.add("Aja for boyfriend");
        list.add("moimoi for boyfriend");
        list.add("semo for boyfriend");
        list.add("Amala for boyfriend");
        assertEquals(7,list.size());
        assertEquals("Money for boyfriend",list.get(2));

       list.add(2,"Pocket money for sister");
       assertEquals("Pocket money for sister",list.get(2));
       assertEquals("Money for boyfriend",list.get(3));

        assertEquals(8,list.size());
    }

    @Test
    public void canExpandArraySize_And_RemoveItemsTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.add("Food for boyfriend");
        list.add("Money for boyfriend");
        list.add("Aja for boyfriend");
        list.add("moimoi for boyfriend");
        list.add("semo for boyfriend");
        list.add("Amala for boyfriend");
        assertEquals(7,list.size());
        assertEquals("Money for boyfriend",list.get(2));

        list.remove("Money for boyfriend");
        assertEquals("Aja for boyfriend",list.get(2));
        assertEquals("moimoi for boyfriend",list.get(3));

        assertEquals(6,list.size());
    }

    @Test
    public void canExpandArraySize_And_RemoveItemsByIndexTest(){
        List list = new ArrayList();
        list.add("Boxer for boyfriend");
        list.add("Food for boyfriend");
        list.add("Money for boyfriend");
        list.add("Aja for boyfriend");
        list.add("moimoi for boyfriend");
        list.add("semo for boyfriend");
        list.add("Amala for boyfriend");
        assertEquals(7,list.size());
        assertEquals("Money for boyfriend",list.get(2));

        list.remove(2);
        assertEquals("Aja for boyfriend",list.get(2));

        list.remove(2);
        assertEquals("moimoi for boyfriend",list.get(2));

        assertEquals(5,list.size());
    }
}
