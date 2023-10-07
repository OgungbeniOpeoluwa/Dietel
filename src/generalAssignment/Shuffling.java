package generalAssignment;

import java.util.Arrays;

public class Shuffling {
    public static void main(String[] args) {
      String [] count ={"A","M","C","W","I","T"};
      String [] count2 =new String[count.length];
      int numbers = 0;
      int county =3;

       for (int number = 0;number < count.length;number++){
           count2[numbers] = count[number];
           if(numbers == 5){
               numbers-=1;
           }
           numbers+=1;
           count2[numbers] = count[county];
           county++;
           numbers+=1;
           if(numbers == 6){
               numbers-=1;
               county -=1;
           }
        }
        System.out.println(Arrays.toString(count2));
    }
}
