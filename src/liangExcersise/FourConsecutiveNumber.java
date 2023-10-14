package liangExcersise;

public class FourConsecutiveNumber {

    public static boolean consecutiveNumber(int [] array) {
        boolean answer = false;
        int []number = new int[array.length];
        int input = 0;
        for(int numb = 0;numb < array.length;numb++){
            input = array[numb];
            if(input <= 1){
                input = 0;
            }
            if(input > 1){
                input -= 1;
            }
            number[input] +=1;
        }
        for(int count = 0;count < number.length;count++){
            if(number[count] == 4){
                answer = true;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(consecutiveNumber(new int[]{2, 2, 4, 5, 1, 2, 4, 2, 2}));
    }
}
