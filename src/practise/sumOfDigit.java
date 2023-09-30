package practise;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of numbers you want to enter : ");
        int lengths = scanner.nextInt();
        System.out.println("Enter your target number: ");
        int target = scanner.nextInt();
        int [] sum =  new int[lengths];
        for(int number = 0;number < sum.length;number++){
            System.out.println("Enter the number : ");
            int input = scanner.nextInt();
            sum[number] = input;
        }
        for(int numb = 0;numb < sum.length;numb++){
            for(int numbs = numb + 1 ; numbs < sum.length;numbs++){
                if(sum[numb] + sum[numbs] == target){
                    ///System.out.println(sum{numb} ,sum{numbs});

                }
            }
        }
    }
}