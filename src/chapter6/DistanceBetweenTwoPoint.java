package chapter6;

public class DistanceBetweenTwoPoint {

    public static double distanceOfTwoFunction(double firstLength1, double firstLength2 , double secondLength1, double secondLength2) {
        double result = Math.pow((firstLength2 - firstLength1),2);
        double result2 = Math.pow((secondLength2 - secondLength1),2);
        return Math.sqrt(result + result2);

    }
}
