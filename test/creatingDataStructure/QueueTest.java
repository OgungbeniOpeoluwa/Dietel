package creatingDataStructure;

import CreatingDataStructure.MyQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
@Test
    public void testThatQueueIsEmpty(){
    MyQueue queue = new MyQueue(3);
    assertTrue(queue.isEmpty());
}
    @Test
    public void testThatQueueIsNotEmpty(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        assertFalse(queue.isEmpty());
    }
    @Test
    public void testThatOfferAdded(){
        MyQueue queue = new MyQueue(3);
        queue.offer(5);
        queue.offer(10);
        queue.offer(23);
        assertFalse(queue.offer(23));
    }
    @Test
    public void testThatElementCanBeenAdded(){
        MyQueue queue = new MyQueue();
        queue.add(5);
        queue.add(5);
        queue.add(5);
        queue.add(6);
        queue.add(89);
       assertEquals(5,queue.size());
    }
    @Test
    public void testThatAssertSizeAdded(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        assertEquals(3,queue.size());
    }
    @Test
    public void testThatQueueIsOverAdded(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> queue.add(21));
    }
    @Test
    public void testThatElementHasBeenRemove(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        assertEquals(5,queue.remove());
    }
    @Test
    public void testThatQueueIsEmptyAndThereIsNothingToRemove(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        queue.remove();
        queue.remove();
        queue.remove();
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> queue.remove());
    }
    @Test
    public void testThatElementHasBeenRemoveWithElement(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        assertEquals(5,queue.poll());
    }
    @Test
    public void testThatQueuePollReturnNull(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        queue.poll();
        queue.poll();
        queue.poll();
        assertNull(queue.poll());
    }
    @Test
    public void testThatQueueElement(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        queue.element();
        assertEquals(5,queue.element());
    }
    @Test
    public void testThatQueueIsEmptyAndMNoElementToReturn(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        queue.remove();
        queue.remove();
        queue.remove();
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> queue.element());
    }

    @Test
    public void testThatQueuePeekMethod(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        queue.peek();
        assertEquals(5,queue.peek());
    }

    @Test
    public void testPrintQueue(){
        MyQueue queue = new MyQueue(3);
        queue.add(5);
        queue.add(10);
        queue.add(23);
        String expected = "[5,10,23]";
        assertEquals(expected,queue.toString());
    }



}