package chapter7;

import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        int [] [] dice = new int [6] [6];
        Random random = new Random();
        int total = 0;
        for(int count  = 1; count < 36000000 ; count++){
            int firstDie = random.nextInt(1,6);
            int secondDie = random.nextInt(1,6);
            total = firstDie + secondDie;
            for(int number = 0;number < 6;number++){
                dice[number][number] = total;
                System.out.println(Arrays.deepToString(dice));


            }

        }

    }
}
