package Assignment;

import java.util.ArrayList;

public class SieveOfErathon {

    public static int [] sieveFunction(int start,int stop) {
        ArrayList <Integer> array = new ArrayList<>();
        for(int numb = start+1;numb <= stop;numb++) {
          if(primeNumber(numb)){
              array.add(numb);
          }

        }

        return arrays(array);
    }
    public static boolean primeNumber(int number) {
        boolean count = false;
        int counts = 0;
            for (int numbs = 2; numbs <= number; numbs++) {
                if (number % numbs == 0) {
                    counts++;
                }
            }
            if (counts < 2) {
                count = true;
            }
            return count;
    }
    public static int [] arrays(ArrayList <Integer> numb) {
        int [] array = new int[numb.size()];
        for(int number = 0;number < numb.size();number++){
            array[number] = numb.get(number);
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println((sieveFunction(1,10)));
    }
}
