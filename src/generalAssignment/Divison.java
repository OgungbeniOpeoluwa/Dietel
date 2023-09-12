package generalAssignment;

public class Divison {
    public static void main(String[] args) {
        int numberA = 6;

        int numberX = numberA + 10;
        int numberY = numberA - 10;
        int numberZ = numberA % 10;

        int total = numberZ * numberX * numberY;
        double divide = (double)numberA / total;
        System.out.println(divide);


    }
}
