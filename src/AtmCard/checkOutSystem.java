package AtmCard;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class  checkOutSystem {
    public static void main(String[] args) {
        final double tax = 0.175;
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dates = DateTimeFormatter.ofPattern("dd-MM-yy  HH:mm:ss ");
        String formatted = date.format(dates);
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> numberOfItems = new ArrayList<>();
        ArrayList<Integer> priceOfItem = new ArrayList<>();
        int count = 0;
        System.out.println("What is the customer name: ");
        String name = scanner.nextLine();

        String answer = "yes".toLowerCase();
        while (answer.equals("yes")) {
            System.out.println("what did the user buy: ");
            String product = scanner.next();
            products.add(product);
            System.out.println("How many pieces ? ");
            int numberOfItem = scanner.nextInt();
            numberOfItems.add(numberOfItem);
            System.out.println("How much per unit: ");
            int price = scanner.nextInt();
            priceOfItem.add(price);
            count++;
            System.out.println("add more item");
            answer = scanner.next();
            answer = answer.toLowerCase();
        }
        System.out.println("Kindly Enter your name: ");
        String cashierName = scanner.next();
        System.out.println("How much discount will he get? ");
        double discount = scanner.nextInt();

        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION : 312,HERBERT MACAULAY,SABO YABA,LAGOS.
                TEL :03293828343
                DATE: %s 
                Casheir's: %s
                Customer Name: %s
                =============================================================
                                    ITEM  QTY  PRICE  TOTAL(NGN)
                -------------------------------------------------------------%n""", formatted, cashierName, name);
        double result = 0;
        for (int number = 0; number < count; number++) {
            int totals = priceOfItem.get(number) * numberOfItems.get(number);
            result += totals;
            System.out.println(products.get(number) + " \t\t " + numberOfItems.get(number) + " \t\t"
                    + priceOfItem.get(number) + " \t\t" + totals + "\t\t" + "\n");
        }
        double subtotal = result * (discount / 100);
        double vat = tax * result;
        System.out.printf("""
                -------------------------------------------------------------
                                            subtotal: %.2f
                                            Discount: %.2f
                                               Vat @ 17.50: %.2f
                ===============================================================%n""", result, subtotal, vat);
        double totalTotal = result + subtotal + vat;
        System.out.printf("""
                ================================================================
                                           Bill Total :%.2f
                =================================================================
                                   THIS IS NOT A RECEIPT KINDLY PAY %.2f
                =================================================================%n""", totalTotal, totalTotal);
        System.out.println("How much did the customer give to you: ");
        double amount = scanner.nextInt();
        while (amount < totalTotal) {
            System.out.println("How much did the customer give to you: ");
            amount = scanner.nextInt();
        }
        double finalResult = amount - totalTotal;
        System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION : 312,HERBERT MACAULAY,SABO YABA,LAGOS.
                TEL :03293828343
                DATE: %s 
                Casheir's: %s
                Customer Name: %s
                =============================================================
                                    ITEM  QTY  PRICE  TOTAL(NGN)
                --------------------------------------------------------------%n""", formatted, cashierName, name);
        for (int number = 0; number < count; number++) {
            int totals = priceOfItem.get(number) * numberOfItems.get(number);
            System.out.println(products.get(number) + " \t\t " + numberOfItems.get(number) + " \t\t"
                    + priceOfItem.get(number) + " \t\t" + totals + "\t\t" + "\n");
        }
        System.out.printf("""
                --------------------------------------------------------------
                                               subtotal: %.2f
                                               Discount: %.2f
                                               Vat @ 17.50: %.2f
                ===============================================================%n""", result, subtotal, vat);
        System.out.printf("""
                =================================================================
                                                  Bill Total :%.2f
                                                  Amount paid : %.2f
                                                   Balance : %.2f
                                               
                =====================================================================
                                           THANK YOU FOR YOUR PATRONAGE
                ======================================================================""", totalTotal, amount, finalResult);


    }

}