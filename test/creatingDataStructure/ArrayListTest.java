package creatingDataStructure;

import CreatingDataStructure.MyArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @Test
    public void testThatIsEmptty(){
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void testThatIsNotEmptyIfIAdd(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(5);
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void testSizeOfArray(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(5);
        myArrayList.add(3);
        myArrayList.add(6);
        int size = 3;
        assertEquals(size,myArrayList.size());
    }
    @Test
    public void getNAumberInArrayList(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(5);
        myArrayList.add(3);
        myArrayList.add(6);
        assertEquals(3,myArrayList.get(1));
    }
    @Test
    public void AddNumberAtIndexInArrayList(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(5);
        myArrayList.add(3);
        myArrayList.add(6);
        myArrayList.add(0,8);
        assertEquals(8,myArrayList.get(0));
    }
    @Test
    public void AddNumberAtIndexInArrayListAndReturnInvalidNumberInTheArrayList(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(5);
        myArrayList.add(3);
        myArrayList.add(6);
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> myArrayList.get(5));
    }
    @Test
    public void getValueUsingIndexOf(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        assertEquals(1,myArrayList.indexOf(2));
    }

    @Test
    public void getValueIfIndexDoesNotExit(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        assertEquals(-1,myArrayList.indexOf(5));
    }
    @Test
    public void getValueOfLastIndex(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        assertEquals(3,myArrayList.LastIndexOf(2));
    }
    @Test
    public void getValueThatDoesNotExitInLastIndex(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        assertEquals(-1,myArrayList.LastIndexOf(9));
    }
    @Test
    public void testThatElementIsBeingRemove(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.remove(2);
        myArrayList.remove(2);
        assertEquals(2,myArrayList.size());
    }
    @Test
    public void testThatElementCanBeRemoveByIndexIndex(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(8);
        myArrayList.remove(1);
        myArrayList.remove(3);
        assertEquals(2,myArrayList.size());
    }

    @Test
    public void checkViewOfArrayElements(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        String expected = "[1,2,3,2]";
        assertEquals(expected,myArrayList.toString());
    }
    @Test
    public void testIfArrayContain(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        System.out.println(myArrayList);
        assertTrue(myArrayList.contains(2));
    }
    @Test
    public void clearArrayList(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
       myArrayList.clear();
        System.out.println(myArrayList);
        assertEquals(0,myArrayList.size());
    }
    @Test
    public void testThatArrayListCanIncreaseInSize(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(5);
        myArrayList.add(7);
        System.out.println(myArrayList);
        assertEquals(6,myArrayList.size());
    }







}