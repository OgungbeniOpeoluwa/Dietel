package Assignment;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling bank = new ExceptionHandling();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin");
        String input = scanner.next();
        bank.setPassword(input);
        boolean result;
        do {
            try {
                  System.out.println("confirm your pin");
                  String inputs = scanner.next();
                  System.out.println(bank.getBalance(inputs));
                  result = false;
            } catch (IllegalArgumentException see) {
                 System.out.println(see.getMessage());
                 result = true;
            }
        }while (result) ;




    }

    private int balance = 1000;
    private String password;

    public void setPassword(String password) {
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
