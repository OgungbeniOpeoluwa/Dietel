package chibuzorAssignment;


public class NumberRange {
    public static void main(String[] args) {

        System.out.println("Number" + "\t\t" + "Number2" + "\t\t" + "power");
        int number;
        int number2;
        int power = 1;
        for (number = 1; number <= 5; number++) {
           //power *=  number  ;

           for (number2 = 1; number2  <= number; number2++) {
               //power = number * number2;
           }
                System.out.println(number + "\t\t\t" + number2 + "\t\t\t" + (int) Math.pow(number, number2));

            }
        }
    }

