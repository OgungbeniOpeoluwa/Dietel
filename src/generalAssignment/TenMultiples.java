package generalAssignment;

import java.util.Scanner;

public class TenMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        int total = 0;
        for (int count = 1; count <= 10;count++){
           total = count * number;
            System.out.println(number + " * " + count + " = "  + total);
        }

    }
}
