package generalAssignment;

public class FrizzBuzz {
    public static void main(String[] args) {
        for(int number = 1; number <= 50; number++){
            if(number / 3 == 5 && number / 5 == 3){
                System.out.println("FizzBuzz");
            }

            else if (number % 3 == 0){
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(number);

            }
        }

    }
}
