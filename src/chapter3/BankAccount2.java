package chapter3;

import java.util.Scanner;

public class BankAccount2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("opeoluwa",50.00);
        BankAccount account2 = new BankAccount("tobi",-7.53);
        displayAccount(account1);
        displayAccount(account2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("adding %.2f to account1 balance%n",depositAmount);
        displayAccount(account1);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount2 = scanner.nextDouble();
        account2.deposit(depositAmount2);
        System.out.printf("%nadding %.2f to account2 balance%n",depositAmount2);
        displayAccount(account2);

    }

    public static void displayAccount(BankAccount accountToDisplay){
       String name = accountToDisplay.getName();
       double balance =  accountToDisplay.getBalance();
        System.out.println(name + " " + "balance : " + balance);

    }
}
