package generalAssignment;

public class Loop {
    public static void main(String[] args){
        int sum = 20;
        for(int result = 1; result <= sum; result++){
            for(int result2 = 1; result2 <= sum; result2++) {
                System.out.print(" \t  " +result2);
            }
            System.out.println(" \t" + result);
        }
    }
}
