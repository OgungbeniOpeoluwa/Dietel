package chapter6;

public class PerfectNumber {
    public static void main(String[] args){
        for(int number = 1;number <= 10000;number++){
            boolean result = isPerfect(number);
            if(result){
                System.out.print(number + " = ");
                for(int numb = 1;numb < number;numb++){
                    if(number % numb == 0){
                        System.out.print(numb + ", ");
                    }
                }
                System.out.println();
            }
        }
    }


    public static boolean isPerfect(int number){

        int total = 0;
        int sum = 0;
        boolean result = false;
        for(int count = 1;count < number ;count++){
            if(number % count == 0 ){
                sum += count;
            }
        }
        if(sum == number){
            result = true;
        }
        return result;


    }
}
