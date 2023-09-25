package chapter4;

public class Tables {
    public static void main(String[] args) {
        System.out.println("N1  N2  N3  N4");
        for (int count = 1; count <= 5; count++) {
            int result = square(count);
            int result2 = cube(count);
            int result3 = multipleOfFour(count);
            System.out.println(count + "\t " + result + "\t "  + result2 + "\t " + result3);
        }

    }


    public static int square(int number) {
        int total = 1;
        for(int count = 1; count <= 2; count++) {
            total *= number;
        }
        return total;
    }

    public static int cube(int number) {
        int result = 1;
        for (int count = 1; count <= 3; count++){
            result *= number;
        }

        return result;

    }


    public static int multipleOfFour(int number) {
        int result = 1;
                for(int count = 1 ; count <= 4; count ++){
                    result *= number;
                }
                return result;

    }


}