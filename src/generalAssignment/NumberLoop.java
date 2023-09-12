package generalAssignment;

public class NumberLoop {
    public static void main(String[] args) {
        int constant = 6;
       for(int row = 1; row <= 6; row++){
           for(int coloumn = 1; coloumn <= row; coloumn++){
               System.out.print(coloumn  );
           }
           for(int sum = row; sum <= 6; sum++){
               System.out.print(" ");
           }
           for(int number = 1; number<=6; number++){
               System.out.print(" ");
           }
           for(int result = 1; result <= 7-row; result++){
               System.out.print(result  );
           }
           for(int space = 1; space <= 6; space++){
               System.out.print(" ");
           }

           for(int coloumn2 = row; coloumn2 >= 1; coloumn2--){
               System.out.print(coloumn2 );
           }
           for(int space = 1; space<= 6;space++) {
               System.out.print(" ");
           }

           for(int sum = 1; sum<= row;sum++ ){
               System.out.print(" ");
           }
           for (int coloumn = 1;coloumn <= 7-row;coloumn++){
               System.out.print(coloumn );
           }

           System.out.println(" ");
       }
    }
}
