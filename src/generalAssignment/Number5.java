package generalAssignment;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        number();






        }

        public static void number(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 0 and 6: ");
            int number =scanner.nextInt();
            switch (number){
                case 0:
                    System.out.println("Sunday");
                    break;

                case 1:
                    System.out.println("monday");
                    break;

                case 2:
                    System.out.println("tuesday");
                    break;

                case 3:
                    System.out.println("wednesday");
                    break;

                case 4:
                    System.out.println("thursday");
                    break;

                case 5:
                    System.out.println("friday");
                    break;

                case 6:
                    System.out.println("satuday");
                    break;

                default:
                    number();
            }


    }
}

