package chapter4;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int studentCounter = 1;
        while(studentCounter <= 10){
            System.out.println("Enter exam result(1 = pass and 2 = fail: ))");
            int result = scanner.nextInt();
            while(result != 1 && result != 2){
                System.out.println("Enter a valid number :");
                result = scanner.nextInt();
            }
            if(result == 1){
              pass = pass + 1;
            }
            else {
                fail = fail + 1;
            }
            studentCounter++;
        }
        System.out.printf("%s%d%n", "number of passes : ", pass);
        System.out.printf("%s%d%n", "number of people who failed : ", fail);
        if(pass > 8){
            System.out.println("Bonus to instructor");
        }
    }
}
