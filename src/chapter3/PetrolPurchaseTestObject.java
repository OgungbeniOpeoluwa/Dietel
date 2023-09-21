package chapter3;

import java.util.Scanner;

public class PetrolPurchaseTestObject {

    public static void main(String[] args){
        PetrolPurchase petrol = new PetrolPurchase("Yaba", "Gasoline", 5, 500.78, 0.005);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Petrol Location : ");
        String location = scanner.nextLine();
        petrol.setLocation(location);

        System.out.println("Enter type of petrol:");
        String petrolType =scanner.nextLine();
        petrol.setPetrolType(petrolType);

        System.out.println("Enter the Quantity : ");
        int quantity = scanner.nextInt();
        petrol.setquantityPurchaseInLitters(quantity);

        System.out.println("Enter petrol price per litter : ");
        double pricePerLitter =scanner.nextDouble();
        petrol.setPricePerLitter(pricePerLitter);

        System.out.println("Enter percentage discount : ");
        double percentageDiscount = scanner.nextDouble();
        petrol.setPercentageDiscount(percentageDiscount);

        System.out.printf("Station location is : %s%n", petrol.getLocation() );
        System.out.printf("Petrol type is : %s%n", petrol.getPetrolType() );
        System.out.printf("Petrol quantity purchase is : %d%n", petrol.getQuantityInLitters() );
        System.out.printf("Petrol price per litter is : %f%n", petrol.getPricePerLitter() );
        System.out.printf("Percentage discount is : %.2f%n", petrol.getPercentageDiscount() );
        System.out.printf("Net amount is: %.2f%n", petrol.getPurchaseAmount());


    }

}


