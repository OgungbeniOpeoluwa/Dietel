package AtmCard;

import java.util.Scanner;

public class CardValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Kindly Enter Card Details to Verify: ");
        String input = scanner.nextLine();
        int result2 = Integer.parseInt(String.valueOf(input.length()));
         while(result2 < 13 || result2 > 16){
             System.out.println("Hello Kindly Enter Card Details to Verify: ");
              input = scanner.nextLine();
              result2 = Integer.parseInt(String.valueOf(input.length()));
         }
        AtmCardMain.display(input);


    }
}
