package generalAssignment;

import java.util.Scanner;

public class FactorialLoopW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
       int input = scanner.nextInt();
       int product = 1;
       while(input > 1){
        product *= input;
         input -= 1;
       }
        System.out.println(product);
    }
}
