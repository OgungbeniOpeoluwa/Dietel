package generalAssignment;

public class Diamond {
    public static void main(String[] arg){
        for(int row = 1;row < 6; row++){
            for(int coloumn = row;coloumn <= 6; coloumn++){
                System.out.print(" ");
            }
            for(int sum = 1; sum<= row;sum++){
                System.out.print("* ");
                }
            System.out.println(" ");
        }
        for(int row = 1; row<=6; row++){
            for(int coloumn = 1; coloumn <= row;coloumn++){
                System.out.print(" ");
            }
            for (int sum = row;sum<= 6; sum++){
                System.out.print("* ");
            }
           System.out.println(" ");
        }
    }
}
