package creatingDataStructure;

import CreatingDataStructure.MyQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    MyQueue queue;
    @BeforeEach
    public void setUp(){
        queue = new MyQueue(5);
    }
@Test
   public void testThatQueueIsEmpty(){
        assertTrue(queue.isEmpty());

    }
    @Test
    public void testThatWhenIAddQueueIsNotMoreEmpty(){
        queue.add(10);
        assertFalse(queue.isEmpty());
    }
    @Test
    public void testThatIfCapacityIsFullAndElementWantToBeTheQueueExceptionIsThrown(){
        queue.add(10);
        queue.add(10);
        queue.add(10);
        queue.add(10);
        queue.add(10);
        System.out.println(queue.toString());
        assertThrows(MyQueue.QueueFullException.class,() -> queue.add(10));
    }
    @Test
    public void testThatElementCanBeAddedThroughOfferMethodsAndItReturnTrue(){
        assertTrue(queue.offer(54));
    }
    @Test
    public void testThatElementCanBeAddedThroughOfferMethodsAndItReturnFalseWhenQueueIsFull(){
        queue.offer(10);
        queue.offer(10);
        queue.offer(10);
        queue.offer(10);
        queue.offer(10);
        assertFalse(queue.offer(54));
    }
    @Test
    public void testThatElementCanBeAddedAndIfIRemoveTheFirstElementGoes(){
        queue.offer(10);
        queue.offer(10);
        queue.offer(10);
        queue.offer(10);
        queue.offer(10);
        assertEquals(10,queue.remove());
    }
    @Test
    public void testThatRemovingAElementWhensItsEmptyThrowsAnException(){
        queue.offer(10);
        queue.offer(13);
        queue.offer(45);
        queue.offer(15);
        queue.offer(16);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        assertThrows(MyQueue.QueueFullException.class, () -> queue.remove());
    }
    @Test
    public void testThatRemovingAElementWhensItsEmptyReturnNUll(){
        queue.offer(10);
        queue.poll();
        assertEquals(null,queue.poll());
    }
    @Test
    public void testRetrievingAElementFromTheQueue(){
        queue.add(10);
        queue.add(25);
        assertEquals(10,queue.element());
    }
    @Test
    public void testThrowsExceptionIfTheQueueIsEmptyAndWantToCollectElement(){
        assertThrows(MyQueue.QueueFullException.class,()->queue.element());
    }
    @Test
    public void testPeekingAElementFromTheQueue(){
        queue.add(10);
        queue.add(25);
        assertEquals(10,queue.peek());
    }
    @Test
    public void testPeekReturnNullWhenTheQueueIsEmpty(){
        assertEquals(null,queue.peek());
    }
    @Test
    public void testThatIfIRemoveAElementFromMyQueueThatIsFullICanStillAddToIt(){
        queue.add(10);
        queue.add(11);
        queue.add(21);
        queue.add(31);
        queue.add(45);
        queue.remove();
        queue.remove();
        assertEquals(21,queue.peek());
        queue.add(54);
        assertEquals(4,queue.getNumberOfElement());
    }
    @Test
    public void test_that_i_can_add_two_elements_if_i_remove_three_its_throw_an_exception(){
        queue.add(54);
        queue.add(54);
        queue.remove();
        queue.remove();
        assertThrows(MyQueue.QueueFullException.class,()->queue.remove());
    }


    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.add(50);
        queue.add(11);
        queue.add(18);
        queue.add(23);
        queue.add(56);
        queue.add(79);
        queue.add(85);
        queue.add(23);
        queue.remove();
        queue.remove();
        System.out.println(queue);

    }






}