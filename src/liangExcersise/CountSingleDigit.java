package liangExcersise;

import java.security.SecureRandom;
import java.util.Arrays;

public class CountSingleDigit {
    public static void main(String[] args) {
//        SecureRandom random = new SecureRandom();
//        int result = 0;
//        int [] array = new int[10];
//        for(int count = 0; count < 100;count++){
//            result = random.nextInt(0,10);
//            array[result] +=1;
//        }
//        System.out.println(Arrays.toString(array));

int [] total = {56,34,76,87};
int [] array = new int[total.length];
int result = 0;
for(int count = 0;count < total.length;count++){
    for(int counts =1 ;counts < total.length;counts++){
        if(total[count] < total[counts]){
            array[count] = count+1;
            result = total[count];
            System.out.println(result);

        }
    }

}
        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }
}
