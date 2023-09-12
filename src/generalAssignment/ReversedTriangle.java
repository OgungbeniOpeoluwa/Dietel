package generalAssignment;

public class ReversedTriangle {
    public static void main(String[] args){
        for(int row =1; row<=6;row++){
            for(int coloumn = 1;coloumn <= row;coloumn++){
                System.out.print(" ");
            }
            for(int sum = row;sum<=6;sum++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
