package AtmCard;
import static AtmCard.Shopping_mall.*;

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

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> numberOfItems = new ArrayList<>();
        ArrayList<Integer> priceOfItem = new ArrayList<>();

        String name = collectInput("What is the customer name: ");
        int count = display(products,numberOfItems,priceOfItem);

        String cashierName = collectInput("Kindly Enter your name: ");
        double discount = numberOfUnit("How much discount will he get? ");



        displayInformation(formatted,name,cashierName);
        displays();
        displayPrices(products,numberOfItems,priceOfItem,count);

        double discounts = discount(numberOfItems,priceOfItem,count,discount);
        double result = totalOfAllPrice(numberOfItems,priceOfItem,count);
        double vat = tax * result;

        displaySubtotal_discount_vat(result,discounts,vat);
        double totalTotal = (result + vat) - discounts;
        displays(totalTotal);


        double amount = numberOfUnit("How much did the customer give to you: ");
        while (amount < totalTotal) {
            amount = numberOfUnit("How much did the customer give to you: ");
        }
        double finalResult = amount - totalTotal;

        displayInformation(formatted,name,cashierName);
        displayPrices(products,numberOfItems,priceOfItem,count);
        displaySubtotal_discount_vat(result,discounts,vat);
        display(totalTotal,amount,finalResult);



    }

}