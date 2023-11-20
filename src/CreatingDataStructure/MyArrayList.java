package CreatingDataStructure;

import java.util.Arrays;

public class MyArrayList {
    private int size = 0;
    private int [] arrays = new int[5];

    public boolean isEmpty (){
        if (this.size == 0)return  true;
        else return false;
    }

    public void add(int element) {
        if (size >= arrays.length){
            int length = arrays.length * 2;
            this.arrays = Arrays.copyOf(arrays,length);
        }
        this.arrays[size++] = element;
    }
    public void add(int index,int element) {
        add(element);
       int [] result = new  int[size+1];
       int counter = 0;
       for(int count = 0; count < size;count++ ){
           if(index == count){
               continue;
           }
           result[count] = arrays[counter];
           counter++;
       }
       result[index] = element;
       this.arrays = result;

    }
    public void set(int index,int element) {
        if(index < size) {
            arrays[index] = element;
        }
        else throw  new ArrayIndexOutOfBoundsException("Index out of bounds");

    }


    public int size() {
        return size;
    }

    public int get(int index) {
        if(!contains(arrays[index])) throw new ArrayIndexOutOfBoundsException("Element does Not Exit");
        else return this.arrays[index];
    }

    public int indexOf(int element) {
        for(int count = 0; count < size; count++){
            if(element == arrays[count]) {
                return count;
            }
        }
        return -1;
    }

    public int LastIndexOf(int element) {
        int result = arrays[size-1];
        if(result == element)return size-1;
        else return -1;
    }

    public void remove(int index) {
        if(index <= size-1) {
            int counter = 0;
            for (int count = 0; count < size; count++) {
                if (count == index) {
                    continue;
                }
                arrays[counter] = arrays[count];
                counter++;
            }
            size--;
        }else{
            throw new ArrayIndexOutOfBoundsException("index out of bound");
        }
    }
    @Override
    public String toString(){
        String result = "";
        for(int count = 0 ; count < size; count++){
            if(count == size -1){
                result += this.arrays[count];
                break;}
            result += this.arrays[count] + ",";
        }
        return String.format("["+ result+ "]");
    }

    public boolean contains(int element) {
        for(int numb: arrays){
            if(element == numb)return true;
        }
        return false;
    }

    public void clear() {
       while (size > 0)
           remove(0);
    }

}
