package BankAPP;

import BankAPP.Exceptions.InvalidPinException;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        mainMenu();

    }
    static Bank gtb = new Bank();

    public static void displayMenu(){
        System.out.println("""
                =============================
                1. Create Account
                2. Deposit
                3. Withdraw
                4.Transfer
                5. check Balance
                ==============================""");
    }

    public static void mainMenu(){
        displayMenu();
        String user_Input = input("Enter a number: ");
        switch (user_Input){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer ();
            case "5" -> checkBalance();
            default -> System.exit(0);

        }
    }

    private static void checkBalance() {
        String pin = input("Enter ya pin : ");
        String accountNumber = input("Enter your account number: ");
        try {
            int balance = gtb.checkBalance(accountNumber,pin);
            print("Your account balance is " + balance);
            mainMenu();
        }
        catch (Exception ex){
            print(ex.getMessage());
            mainMenu();
        }
    }

    private static void withdraw() {
        String accountNumber = input("Enter your account number: ");
        int amount = Integer.parseInt(input("Enter amount: "));
        String pin = input("Enter ya pin : ");
        try{
            gtb.withdrawl(amount,accountNumber,pin);
            print("Withdraw successful");
            mainMenu();
        }
        catch(Exception ex){
            print(ex.getMessage());
            mainMenu();
        }
    }

    private static void transfer() {
        String accountNumber = input("Enter your account number : ");
        String recieverAccount = input("Enter reciever account number : ");
        String pin = input("Enter your pin: ");
        int amount = Integer.parseInt(input("Enter amount : "));
        try{
            gtb.transfer(accountNumber,recieverAccount,amount,pin);
            print("transfer successful");
            mainMenu();
        }
        catch(Exception ex){
            print(ex.getMessage());
            mainMenu();

        }
    }

    private static void deposit() {
        String accountNumber = input("Enter your account number: ");
        int amount = Integer.parseInt(input("Enter amount: "));

        try{
            gtb.deposit(amount,accountNumber);
            print("Deposit successful");
            mainMenu();
        }
        catch(Exception ex){
            print(ex.getMessage());
            mainMenu();
        }
    }

    public static void createAccount(){
        String name = input("Enter your first name: ");
        String secondName = input("Enter your second name");
        String pin = input("Enter your pin ");
       BankAccount account = gtb.createAccount(name,secondName,pin);
        print(account.toString());
        mainMenu();

    }

    public static String input(String message){
        Scanner scanner = new Scanner(System.in);
        print(message);
        return scanner.nextLine();
    }
    public static void print(String message){
        System.out.println(message);
    }


    }
