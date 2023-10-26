package liangExcersise;

import java.security.SecureRandom;

public class CountDigit {
    public static void main(String[] args) {
        displayCount();
    }
    static SecureRandom random  = new SecureRandom();

    public static int [] array(){
        int [] array = new int[10];
        for(int count = 0; count < 100; count ++){
            int input = random.nextInt(0,10);
            array[input] +=1;
        }
        return array;
    }
    public static void displayCount(){
        int [] result = array();
        for(int numb = 0; numb < result.length;numb++){
            System.out.print(numb + "\t\t" + result[numb]);
            System.out.println();
        }
    }
}
