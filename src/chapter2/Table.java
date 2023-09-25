package chapter2;

public class Table {
    public static void main(String[] args) {
        int square;
        int cube;
        System.out.printf("%s%12s%10s\n","Number","Square", "Cube");
        for(int number = 1;number <= 10;number++){
            square = number * number;
            cube = number * square;
            System.out.printf("%d%14d%12d%n", number, square, cube);
        }
    }
}
