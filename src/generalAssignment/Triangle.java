package generalAssignment;

public class Triangle {
    public static void main(String[] args) {
        for(int count = 1 ; count < 6;count++){
            for(int coloumn = count;coloumn <= 6 ; coloumn ++){
                System.out.print("  ");
            }
            for(int sum = 1; sum <=  count ;sum++){
                System.out.print("* ");
            }
            for(int sum =1;sum < count;sum++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int row = 1; row <= 6; row++){
            for(int coloumn = 1; coloumn <= row ;coloumn++){
                System.out.print("  ");
            }
            int sum;
            for(sum = row; sum <= 6;sum++){
                System.out.print("* ");
            }
            for(int total = row; total < 6;total++){
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }

}
