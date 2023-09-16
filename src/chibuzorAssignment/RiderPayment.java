package chibuzorAssignment;

import java.util.Scanner;

public class RiderPayment {
    private static int packageDelivered;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly Total Number Of Successful Delivery For Today :");
        int successfulDelivery = scanner.nextInt();
        int result = paymentCalculator(successfulDelivery);
        System.out.println("Your Wage for Today is : " + result);

    }








    public static int paymentCalculator(int packageDelivered) {
        int wages;
        if (packageDelivered < 50) {
            wages = packageDelivered * 160 + 5000;
        }
        else if (packageDelivered <= 59) {
            wages = packageDelivered * 200 + 5000;
        }
        else if (packageDelivered <= 69){
            wages = packageDelivered * 250 + 5000;
        }
        else {
            wages = packageDelivered * 500 + 5000;
        }

        return wages;
    }
}
