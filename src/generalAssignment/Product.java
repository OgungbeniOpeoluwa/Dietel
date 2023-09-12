package generalAssignment;

public class Product {
    public static void main(String[] args) {
        int number = 5;
        int n = 3;
        int total =1;
        int num =1;
        while (num <= n) {
            total *= number;
            num++;
        }
        System.out.println(total);


    }
}
