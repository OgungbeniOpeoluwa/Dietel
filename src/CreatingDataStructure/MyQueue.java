package CreatingDataStructure;


import java.util.Arrays;

public class MyQueue {

    private int numberOfElement;
   private final int capacity;
   private final int [] arraysOfNumbers;
    int count;

    public int getNumberOfElement() {
        return numberOfElement;
    }

    public MyQueue(int capacity) {
        arraysOfNumbers = new int[capacity];
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return numberOfElement == 0;

    }

    public boolean add(int element) {
        attemptToShiftElements();
        checkIfQueueIsFull();
         arraysOfNumbers[numberOfElement++]  = element;
        return true;
    }

    private void attemptToShiftElements() {
        int counter = 0;
        if(count > 0){
            for(int counts = count; counts < numberOfElement;counts++){
               int temp = arraysOfNumbers[counter];
                arraysOfNumbers[counter] = arraysOfNumbers[counts];
                arraysOfNumbers[counts] = temp;
                System.out.println(Arrays.toString(arraysOfNumbers));
                counter++;
            }
           this.numberOfElement -= count;
           count = 0;

        }
    }

    private void checkIfQueueIsFull() {
        if(numberOfElement == capacity)throw new QueueFullException("Capacity full");
    }

    public boolean offer(int element) {
        try {
            return add(element);
        }
        catch (QueueFullException ex){
            return false;
        }
    }

    public int remove() {
        validateIfQueueIsEmpty();
        validateIfAllInputsAreRemoved();
        int element = arraysOfNumbers[count];
        arraysOfNumbers[count] = 0;
        count++;
        return element;
    }

    public Integer poll() {
        try{
           return remove();
        }
        catch (QueueFullException ex){
            return null;
        }
    }

    public int element() {
        validateIfQueueIsEmpty();
        return arraysOfNumbers[count];
    }

    public Integer peek() {
        try{
            return element();
        }
        catch(QueueFullException ex){
            return null;
        }
    }
    public String toString() {
        if(count > 0) return String.format("[" + arraysOfElementInputted(count) + "]");
        else return String.format("[" + arraysOfElementInputted(0) + "]");
    }




    private String arraysOfElementInputted(int count) {
        String result = "";
        for (int counts = count; counts < numberOfElement; counts++) {
            if (counts == numberOfElement - 1) {
                result += this.arraysOfNumbers[counts];
                break;
            }
            result += this.arraysOfNumbers[counts] + ",";
        }
        return result;
    }

    private void validateIfQueueIsEmpty(){
            if(numberOfElement == 0) throw  new QueueFullException("Queue is empty");
        }

        private void validateIfAllInputsAreRemoved(){
            if( count == numberOfElement)throw new QueueFullException("Queue is empty");
        }


    public static class QueueFullException extends RuntimeException {

        public QueueFullException(String message) {
            super(message);
        }
    }

   


}
