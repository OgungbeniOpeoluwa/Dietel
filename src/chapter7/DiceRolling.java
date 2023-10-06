package chapter7;

import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        int [] [] dice = new int [6] [6];
        Random random = new Random();
        int total = 0;
        for(int count  = 0; count < dice.length ; count++){
            for(int number = 0;number < dice.length ;number++) {
                int firstDie = random.nextInt(1, 6);
                int secondDie = random.nextInt(1, 6);
                total = firstDie + secondDie;
                System.out.print(total + "  "  );
            }
            System.out.println();
        }


    }
}
