package practise;

public class factorial {
    public static void main(String[] args) {
        int total = 1;
        int number;
        for(number = 5; number >= 1; number --){
            total *= number;
            if (number == 1) {
                System.out.print(number + " = " + total);
                break;
            }
            System.out.print(number  + " * " );


        }

    }
}
