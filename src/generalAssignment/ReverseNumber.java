package generalAssignment;

public class ReverseNumber {


    public static int reverseNumber(int userInput) {
        int count = 0;
        int total = 1;
        while(userInput != 0){
            total = userInput % 10;
            count = count * 10 + total;
            userInput /= 10;

        }
        return count;
    }
}
