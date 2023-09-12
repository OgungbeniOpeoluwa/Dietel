package chapter4;

import java.util.Scanner;

public class TaxCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxCalculator tax = new TaxCalculator();


        for(int sum =1 ; sum <= 3;sum++){
            System.out.println("Kindly Enter Your Name");
        String name = scanner.next();
        tax.setName(name);

        System.out.println("Kindly Enter Your Earning For The Year: ");
        int salary = scanner.nextInt();
        tax.calculator(salary);

            System.out.println("Total tax for" + " " + tax.getName() + " " +  "is" + "  " + tax.totalTax());

       }


    }
}
