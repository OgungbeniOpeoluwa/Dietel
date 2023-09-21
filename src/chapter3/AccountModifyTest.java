package chapter3;

public class AccountModifyTest {
    public static void main(String[] args){
    AccountModify account = new AccountModify("delighted",50.00);
        AccountModify account3 = new AccountModify("opeoluwa",100.00 );
        account.deposit(5000);
        account3.deposit(1000);

        account.withdraw(500);
        account3.withdraw(-1000);
        System.out.println(account.getName() + " current balance : " + account.checkBalance());
        System.out.println(account3.getName() + " current balance: "+ account3.checkBalance());

        }

    }


