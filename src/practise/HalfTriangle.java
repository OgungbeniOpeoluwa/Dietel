package practise;

public class HalfTriangle {
   public static void main(String[] args) {
       secondRow(5);
       row(5);

  }

    public static void firstTriangle(int numbers ){
        for(int row = 1;row <= numbers;row++){
            System.out.print("* ");
        }
        System.out.println(" ");
    }
    public static void secondTriangle(int number){
        for(int rows = number;rows < 5;rows++){
            System.out.print("* ");
        }
        System.out.println(" ");

    }
    public static void row(int number) {
        for(int numbers = 1; numbers <= number;numbers++ ){
            secondTriangle(numbers);
        }
    }
    public static void  secondRow(int number){
        for(int numbers = 1; numbers <= number;numbers++ ){
            firstTriangle(numbers);
        }

    }
//    public static void triangle(int number){
//       for(int numbers = 1;numbers < number; numbers++){
//           System.out.print("* ");
//       }


}
