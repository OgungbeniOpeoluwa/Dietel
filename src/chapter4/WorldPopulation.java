package chapter4;

public class WorldPopulation {
    public static void main(String[] args) {
        long population = 8045311447L;
        double growthRate = 0.088;
        long total = 0;
        long diffrence = 0;
        System.out.println("Year  Population  Numeric Increase");
        for(int number = 1; number <= 75; number ++){
          total = (long) (population * raiseToPower(1 +growthRate,number));
          diffrence = total - population;
            System.out.println(number + " \t " + total + " \t " + diffrence);


        }
    }


    public static double raiseToPower(double counter,int count){
        double total = 1;
        for(int number = 1;number <= count;number++){
            total *= counter;

        }
        return total;
    }
}
