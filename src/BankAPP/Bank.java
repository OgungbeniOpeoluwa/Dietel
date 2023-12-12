package BankAPP;

import BankAPP.Exceptions.InvalidAccountNumber;

import java.util.ArrayList;

public class Bank {

    private int totalNumberOfAccount;
    private ArrayList <BankAccount> accounts = new ArrayList<>();

    public BankAccount createAccount(String firstName, String secondName, String pin) {
        totalNumberOfAccount++;
        String accountName = generateAccountName(firstName,secondName);
        String accountNumber = generateAccountNumber();
        BankAccount account = new BankAccount(accountName,accountNumber,pin);
        accounts.add(account);
        return account;
    }

    private String generateAccountNumber() {
        return  totalNumberOfAccount + "";
    }

    private String generateAccountName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }

    public int getTotalNumberOfAccount() {
        return totalNumberOfAccount;
    }

    public BankAccount findAccount(String number) {
        for(BankAccount account: accounts){
            if(account.getAccountNumber().equals(number)){
                return account;}
        }
        throw new InvalidAccountNumber("Invalid Account Number");

    }

    public void deposit(int amount, String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public int checkBalance(String accountNumber, String pin) {
        BankAccount account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public void withdrawl(int amount, String accountNumber,String pin) {
        BankAccount account = findAccount(accountNumber);
        account.withdrawl(amount,pin);
    }

    public void transfer(String senderAccountNumber, String recieverAccountNumber, int amount, String pin) {
        BankAccount sender = findAccount(senderAccountNumber);
        BankAccount reciever = findAccount(recieverAccountNumber);
        sender.withdrawl(amount,pin);
        reciever.deposit(amount);    }

}
