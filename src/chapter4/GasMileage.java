package chapter4;

import java.util.Scanner;

public class GasMileage {
    private int miles;
    private int gallon;
    private int fuelConsumption;
    private double totalAverage;
    private int totalNumberOfCount;

    private int totalConsumption;

    public void miles(int miles) {
        this.miles = miles;
    }

    public int getMiles(){
        return miles;
    }

    public void setNumberOfCount(int count){
        this.totalNumberOfCount = count;

    }

    public void gallon(int gallon) {
        this.gallon = gallon;
    }
    public int getGallon(){
        return gallon;
    }

    public void milesPerGallon(int gallon,int miles){
        this.gallon = gallon;
        this.miles = miles;
        fuelConsumption = miles/gallon;
    }

    public int getFuelConsumption(){
        return fuelConsumption;
    }
    public int totalFuelConsumption(){
        return totalConsumption;
    }
    public int getTotalNumberOfCount(){
        return totalNumberOfCount;
    }
}
