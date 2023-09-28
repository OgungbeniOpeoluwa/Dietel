package practise;

import java.util.Scanner;

public class StudentMajor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two Characters with separated space: ");
        String userInput = scanner.next();
        String input = scanner.next();
        System.out.print(StudentMajor.major(userInput,input));
        System.out.println("Press 1 if you will like to continue or press (0)to stop :");
        int number = scanner.nextInt();
        while ( number != 0){
            System.out.print("Enter two Characters with separated space: ");
            userInput = scanner.next();
             input = scanner.next();
            System.out.print(StudentMajor.major(userInput,input));
            System.out.println("Press 1 if you will like to continue or press (0)to stop :");
            number = scanner.nextInt();
        }
    }






    public static String major(String userInput, String status){
        String answer;
         switch (userInput) {
            case "M" -> answer = "Mathematics " + StudentMajor.status(status);
            case "C" -> answer = "Computer Science " + StudentMajor.status(status);
            case "I" -> answer ="Information Technology " + StudentMajor.status(status);
            default -> answer = "Invalid Input";
        };
        return answer;
    }
    public static String status(String status) {
        String answer = " ";
        switch (status) {
            case "1" -> answer = "Freshman";
            case "2" -> answer = "Sophomore";
            case "3" -> answer = "Junior";
            case "4" -> answer = "Senior";
        }
        return answer;
    }


}
