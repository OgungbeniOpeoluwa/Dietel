package generalAssignment;

import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.next();

        for(int sum = 1; sum <= password.length(); sum++){
            System.out.print("*");


        }
    }
}
