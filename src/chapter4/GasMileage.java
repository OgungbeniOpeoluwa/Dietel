package chapter4;

import java.util.Scanner;

public class GasMileage {
    private double miles;
    private double gallon;

    public void miles(double miles) {
        this.miles = miles;
    }

    public double getMiles(){
        return miles;
    }


    public void gallon(double gallon) {
        this.gallon = gallon;
    }
    public double getGallon(){
        return gallon;
    }
    double total = 0;
    public double milesPerGallon(){
        total = this.miles / this.gallon;
        return total;

    }
    double gallonCount = 0;
    double milesCount = 0;
    public double combinedMilesPerGallon(){
         gallonCount += this.gallon;
         milesCount += this.miles;
        return milesCount / gallonCount;
    }

}
