package chapter6;

public class PrimeNumber {
    public static void main(String[] args){
        for(int count = 2; count <= 10;count++){
            boolean result = isPrimeNumber(count);
            if(result){
                System.out.println(count + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int number){
        int count = 0;
        for(int numb = 1;numb < number;numb++){
            if(number % 2 == 0){
                count +=1;
            }
        }
        boolean result = false;
        if(count < 2){
            result = true;
        }
        return result;
    }

}
