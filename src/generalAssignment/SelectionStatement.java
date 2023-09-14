package generalAssignment;

import java.util.Scanner;

public class SelectionStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int userInput = scanner.nextInt();;
        if(userInput % 2 == 1){
            System.out.println(userInput + " odd number ,Weird");
        }
        else if (userInput % 2 == 0 && userInput <= 5) {
            System.out.println(userInput + "  a even number that is between the range of 2 to 5 ,Not weird");
        }
        else if(userInput % 2 == 0 && userInput > 5 && userInput <= 20){
            System.out.println(userInput + "  a even number that is between the range of 6 to 20, weird");
        }
        else{
            System.out.println(userInput + " a even number that is greater than 20 , not weird");
        }
    }
}
