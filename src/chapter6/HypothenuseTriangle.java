package chapter6;

public class HypothenuseTriangle {

    public static double hypotenuseCalculations(double firstNumber, double secondNumber) {
        double result = Math.pow(firstNumber,2);
        double result2 = Math.pow(secondNumber,2);
        return Math.sqrt(result+result2);
    }
}
