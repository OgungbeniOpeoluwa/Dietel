package liangExcersise;

import chapter5.BreakStatement;

public class ComputerDeviation {

    public static double[] getInput(double ... number) {
        double [] numbers = new double[number.length];
        for(int numb = 0;numb < number . length;numb++){
            numbers[numb] = number[numb];
        }
        return numbers;
    }

    public static double total(double[] number) {
        double result = 0;
        for(int numb = 0; numb < number.length; numb++){
            result += number[numb];
        }
        return result;
    }
    public static double getTotal(double[] number){
        return total(number);
    }

    public static double mean(double[] number) {
        return Double.parseDouble( String.format("%.2f",getTotal(number) / number.length));
    }

    public static double variance(double[] number) {
        double total = 0;
        double results = mean(number);
        for(int numb = 0; numb < number.length;numb++){
            double result = Math.pow(number[numb] - results,2);
            total += result;
        }
        return total;
    }
    public static double standardDeviation(double[] number) {
        double result = variance(number);
        double product = number.length - 1;
        double results = result/product;
        return Double.parseDouble(String.format("%.5f",Math.sqrt(results))) ;
    }

}
