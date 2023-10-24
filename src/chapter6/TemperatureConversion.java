package chapter6;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.TO GET THE CELSIUS EQUIVALENT
                2. TO GET THE KELVIN EQUIVALENT""");
        int input = scanner.nextInt();
        if(input == 1){
            System.out.println("Enter a Kelvin Temperature");
            int result = scanner.nextInt();
            System.out.println("celsius temperature is : "+ kelvin(result));
        }
        else{
            System.out.println("Enter a celsius Temperature");
            int result = scanner.nextInt();
            System.out.println("kelvin temperature is " + celsius(result));
        }


    }
    public static double kelvin(int celsius){
        return celsius + 273.15;
    }
    public static double celsius(int kelvin){
        return kelvin - 273.15;
    }
}
