package chapter3;

public class AccountModify {
    private String name;
    private double balance;

    public AccountModify(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double checkBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
        }
    public void  withdraw(double amount) {
        if (amount > balance || amount < 0) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else {
            balance -= amount;
        }
    }

}


