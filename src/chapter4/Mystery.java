package chapter4;

public class Mystery {
    public static void main(String[] args) {
        int x = -2;
        int total = 0;
        while(x <= 100){
            int y = x + 1;
            x++;
            total +=y;
            System.out.printf("Y is : %d and tota1 is %d\n", y, total);
        }
    }
}
