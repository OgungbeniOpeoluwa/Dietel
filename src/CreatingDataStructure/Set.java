package CreatingDataStructure;

import java.util.HashSet;

public class Set {
    MyArrayList arrayList = new MyArrayList();

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public void add(int element) {
        if(!(arrayList.contains(element))){
            arrayList.add(element);
        }
    }

    public int size() {
       return arrayList.size();
    }
    public String toString(){
        return arrayList.toString();
    }
    public void remove(int element){
        int number = arrayList.indexOf(element);
        arrayList.remove(number);
    }

    public boolean contains(int element){
        return arrayList.contains(element);
    }


    public void iterator() {
        for (int count = 0; count < size(); count++)
            System.out.println(arrayList.get(count));
    }
}

