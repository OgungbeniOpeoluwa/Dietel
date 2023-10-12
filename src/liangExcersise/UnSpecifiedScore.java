package liangExcersise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UnSpecifiedScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> scores = new ArrayList<>();
        System.out.println("Enter score or press -1 to stop");
        int input = scanner.nextInt();
        scores.add(input);
        int total = input;
        int count = 1;
        while(input != -1){
            System.out.println("Enter score or press -1 to stop");
            input = scanner.nextInt();
            if(input != -1) {
                scores.add(input);
                total += input;
                count++;
            }

        }
        int numbers = 0;
        int below = 0;
        double average =(double) total/ count;
        for(int numb = 0; numb < count ;numb++){
            int result = scores.get(numb);
            if(result >= average){
                numbers++;
            }
            if(result < average){
                below++;
            }
        }
        System.out.println("Average of all scores is: " + average);
        System.out.println("scores above the average is : " + numbers);
        System.out.println("scores below  average : " + below);
    }
}
