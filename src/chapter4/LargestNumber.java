package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = null;
        int largest = 0;
        int count = 0;
        for(int sum = 1;sum <= 10;sum++){
            System.out.println("Kindly Enter your name: ");
             name = scanner.next();
            
            
            System.out.println("Enter number of unit sold");
            int number = scanner.nextInt();

            if(number > largest){
                largest = number;
            }
            count++;
        }
        System.out.println( name + "  has the highest unit,which is : " + largest);
        System.out.println(count);
    }
}
