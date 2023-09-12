package generalAssignment;

import com.sun.security.jgss.GSSUtil;

public class EvenNumbers {
    public static void main(String[] args) {
        int number = 1;
        for ( number = 1; number <= 100; number++) {
            System.out.print(number + " \t");
        }
        System.out.println(" ");
        for(int sum = 2 ;sum <= 100;sum = sum+2) {
            System.out.print(sum + "\t");
        }
        System.out.println(" ");
        for(int odd = 1 ; odd <= 100 ; odd = odd + 2){
            System.out.print(odd + "\t");


        }
    }
}

