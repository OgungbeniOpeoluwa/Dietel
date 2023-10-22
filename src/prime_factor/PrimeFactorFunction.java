 package prime_factor;

public class PrimeFactorFunction {

    public static String primeNumber(int number) {
        String result = "";
        for(int count = 2;count <= number;count++){
            while(number % count == 0){
                number /= count;
                result += count;
            }
        }
        return result;
    }

    public static int [] primeNumberFunction(int number) {
        String results = primeNumber(number);
        int [] result = new int[results.length()];
        for(int count = 0; count < result.length;count++){
            result[count] = Integer.parseInt(String.valueOf(results.charAt(count)));
        }
        return result;
    }
}
