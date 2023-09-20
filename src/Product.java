public class Product {
    public static int multiplication(int numberOne, int numberTwo) {
        boolean isNegative = numberOne < 0 && numberTwo < 0;
        int total = 0;
        if (numberTwo > 0) {
            for (int count = 1; count < numberTwo; count++) {
                total += numberOne;
            }
        }
        else{
            total = numberTwo;
            for (int count = 1; count < numberOne; count++) {
                total += numberTwo;
            }
        }
            if(isNegative){
                int number = -1;
                numberOne *= number;
                numberTwo *= number;
                total = numberOne;
                for (int count = 1; count < numberTwo; count++) {
                    total += numberOne;

                }

            }
            return total;
    }
}
