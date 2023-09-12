package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                            Will you like to calculate department store customer that has exceed limit on a charge account
                            if yes press 1 if No press 0
                            """);
        int stop = scanner.nextInt();
        int balance= 0;

        for(; stop != 0;){
            System.out.println("Kindly enter your account number: " );
            String account = scanner.next();

            System.out.println("Kindly enter your balance at the beginning of the month : ");
            int balanceForTheMonth = scanner.nextInt();

            System.out.println("kindly enter total amount of goods bought for the month: ");
            int item = scanner.nextInt();

            System.out.println("kindly enter the total credit amount applied to customer 's account this month: ");
            int creditAmount = scanner.nextInt();

            System.out.println("Kindly enter customer credit limit: ");
            int creditLimit = scanner.nextInt();

            balance = balanceForTheMonth + item - creditAmount;

            if(balance <= creditLimit){
                System.out.println(account + " " + "current balance is : "  + balance);
                System.out.println("credit limit has not be exceeded");
            }

            if(balance > creditLimit){
                System.out.println(account + " " + "current balance is : "+ balance);
                System.out.println("credit limit exceeded");
            }

            System.out.println("""
                            Will you like to calculate department store customer that has exceed limit on a charge account
                            if yes press 1 if No press 0
                            """);
            stop = scanner.nextInt();

        }
    }
}
