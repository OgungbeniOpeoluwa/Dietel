package Assignment;

public class forEach {
    public static void main(String[] args) {
        int [][] number = {{34,23,65},{23,67,44,68}};
        for(int [] array : number){
            for(int nums : array){
                System.out.printf(nums + "   ");
            }
            System.out.println();
        }

        }
    }

