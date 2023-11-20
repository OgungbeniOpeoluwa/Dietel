package CreatingDataStructure;

public class MyQueue {
    private int size;
  MyArrayList arrayList = new MyArrayList();
    public MyQueue(int size){
        this.size = size;
    }
    public MyQueue(){
    }

    public  boolean isEmpty() {
        return arrayList.isEmpty();
    }


    public void add(int element) {
        if (arrayList.size() != size || size == 0) arrayList.add(element);
        else throw new ArrayIndexOutOfBoundsException("Array out of bounds");
    }

    public boolean offer(int element) {
        if (arrayList.size() != size || size == 0) {
            arrayList.add(element);
            return true;
        }
        else return false;
    }

    public int size() {
        return arrayList.size();
    }

    public int remove() {
        int result;
        if(arrayList.isEmpty()) throw new ArrayIndexOutOfBoundsException("Queue is Empty");
        else{
            result = arrayList.get(0);
            arrayList.remove(0);
        }
        return result;
    }

    public Integer poll() {
        int result = 0;
        if(arrayList.isEmpty()) return null;
        else{
            result = arrayList.get(0);
            arrayList.remove(0);
        }
        return result;
    }

    public int element() {
        if(arrayList.isEmpty()) throw new ArrayIndexOutOfBoundsException("Queue is Empty");
        else return arrayList.get(0);

    }

    public Integer peek() {
        if(arrayList.isEmpty()) return null;
        else return  arrayList.get(0);
    }
    public String toString(){
        return arrayList.toString();
    }
}
