 package generalAssignment;

public class Loop2{
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row ++) {
            for (int coloumn = 1; coloumn <= row; coloumn++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= 5; space++) {
                System.out.print(" ");
            }
            for (int coloumn2 = row; coloumn2 <= 5; coloumn2++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= 5; space++) {
                System.out.print(" ");
            }
            for (int coloumn3 = row; coloumn3 <= 5; coloumn3++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= 5; space++) {
                System.out.print(" ");
            }
            for (int coloumn3 = 1; coloumn3 <= row; coloumn3++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        }
    }
