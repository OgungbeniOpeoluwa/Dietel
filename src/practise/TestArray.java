package practise;

public class TestArray {
    public static void main(String[] args) {
        int [] [] numbs = new int [2][3];
        for(int number = 0;number < 2; number++){
            for(int numbers = 0; numbers < 3;numbers ++){
                int random= (int)(Math.random() * 10);
                numbs[number][numbers] = random;
                System.out.print(numbs[number][numbers] + " ");
            }
            System.out.println();
        }

    }
}
