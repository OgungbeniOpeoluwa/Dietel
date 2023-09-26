package studentScore;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int total = 0;
        for(int number = 2; number <= 10 ; number = number + 2){
            total+= number;
        }
        System.out.println("The sum of the even numbers is : " + total);
    }
}
