package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class ReductionToMakeArrayEqual {

    public static   ArrayList<Integer>  reductionFunction(ArrayList <Integer> number) {
        int count = 0;
        int counter = number.size();
       while (count < counter) {
       int maximum = max(number);
           System.out.println(maximum);
       number.remove(maximum);
       int maximums = max(number);
           System.out.println(number);
       number.add(maximum,number.get(maximums));
           System.out.println(number);
       counter--;
     }

        return number;

    }
    private static  int max(ArrayList <Integer> array){
        int maximum = array.get(0);
        int maxi = 0;
        for(int count = 0; count < array.size(); count++){
            if(array.get(count) > maximum){
               maxi = count ;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        ArrayList  <Integer> numb = new ArrayList<>();
        numb.add(5);
        numb.add(3);
        numb.add(1);
        System.out.println(reductionFunction(numb));
    }
}
