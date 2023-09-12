package generalAssignment;

import java.util.Scanner;

public class Account3Test {
    public static void main(String[] args){
        Account3 account = new Account3(10000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kindly enter how much you will like to deposit: ");
        int amount = scanner.nextInt();
        account.deposit(amount);
        System.out.printf("deposit amount; %d%n ",account.checkBalance());



        System.out.println("Kindly enter how much you will like to withdraw: ");
        int amount2 = scanner.nextInt();
        account.withdraw(amount2);


        System.out.printf("deposit amount; %d%n ",account.checkBalance());

        System.out.printf("your current balance after withdraw :%d%n ",account.checkBalance());
    }
}
