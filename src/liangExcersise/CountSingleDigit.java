package liangExcersise;

import java.security.SecureRandom;
import java.util.Arrays;

public class CountSingleDigit {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int result = 0;
        int [] array = new int[10];
        for(int count = 0; count < 100;count++){
            result = random.nextInt(0,10);
            array[result] +=1;
        }
        System.out.println(Arrays.toString(array));
    }
}
