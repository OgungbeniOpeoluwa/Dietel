package Assignment;

import java.util.Scanner;

public class OpeLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        int sum = 0;
        if(userInput > 1){
            for(int count = 1;count <= userInput;count++){
                if(userInput % count==0){
                    sum++;
                    System.out.println(count);
                }
            }
        }

        System.out.println(sum);
        if(sum > 2) System.out.println("it is not a prime");
        if(sum == 2) System.out.println("Its a prime");
    }
    }

