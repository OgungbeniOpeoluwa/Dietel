package chapter4;

public class Tables {
    public static void main(String[] args) {
        square();
    }

    public static void square(){
        int total = 0;
        for(int number = 1; number <= 5; number++){
            total = number * number;
            System.out.println(total );
        }

    }

    public static  void cube(){
        int result = 0;
        for (int number = 1; number <= 5; number++){
            result = number * number * number;
            System.out.println(result);
        }
    }

    public  static  void multipleOfFour(){

    }
}
