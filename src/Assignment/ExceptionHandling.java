package Assignment;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling bank = new ExceptionHandling();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin");
        String input = scanner.next();
        bank.setBalance(input);
        String inputs = "";
        do {
            try {
                System.out.println("confirm your pin");
                 inputs = scanner.next();
                System.out.println(bank.getBalance(inputs));
            } catch (IllegalArgumentException see) {
                System.out.println(see.getMessage());
                System.out.println("enter valid pin");
                 inputs = scanner.next();
            }
        }while (!input.equalsIgnoreCase(inputs)) ;




    }

    private int balance = 1000;
    private String password;

    public void setBalance(String password) {
        this.password = password;


    }public int getBalance(String password){
        if(this.password.equalsIgnoreCase(password)){
            return balance;
        }
        else{
            throw new IllegalArgumentException("Invalid pin");

        }
    }
}
