package chapter6;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CoinToss {
    static int head = 1;
    static int tail = 2;
    static  int count = 0;
    static int counter = 0;
    private  enum coinEnum {HEAD,TAIL}
    static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to toss a coin or enter 0 to stop");
        int input = scanner.nextInt();
        while(input == 1) {
           int result = coinToss();
            if (result == head) {
                count++;
            } else {
                counter++;
            }
            System.out.println("Press 1 to toss a coin or enter 0 to stop");
            input = scanner.nextInt();
        }
        System.out.println("number of head : "+ count);
        System.out.println("number of tails : "+ counter);

    }


    public static int coinToss(){
         int result = random.nextInt(1, 3);
         return result;

        }
}


