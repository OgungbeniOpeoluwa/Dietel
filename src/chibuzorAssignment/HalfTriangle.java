package chibuzorAssignment;

public class HalfTriangle {
    public static void main(String[] args) {
         for(int row = 1; row <= 10 ;row ++){
             for(int count = row;count <= 10;count++){
                 System.out.print("  ");
             }
             for(int count = 1; count <= row; count++){
                 System.out.print("  ");
             }
             for(int count = 1;count < row;count++){
                 System.out.print("* ");
             }
             System.out.println(" ");
         }
         for(int row = 1; row <= 10;row ++){
             for(int count = 1 ; count <= row; count++){
                 System.out.print("  ");
             }
             for(int count = row;count <= 10;count++){
                 System.out.print("  ");
             }
             for(int count = row;count <= 10;count++){
                 System.out.print("* ");
             }
             System.out.println(" ");
         }
    }
}
