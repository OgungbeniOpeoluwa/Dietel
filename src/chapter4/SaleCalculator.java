package chapter4;

import java.util.Scanner;

public class SaleCalculator {
    private int unitSold;

    public void set_unit_sold(int unitSold){
        this.unitSold = unitSold;
    }
    public int get_unit_sold(){
        return unitSold;
    }

    public double salesCalculator(double percent,int number_of_item) {
        double result = 0;
        int unitCount = 0;
        if (number_of_item == 1) {
            double percentage = percent / 100;
            result = 200 + percentage * this.unitSold;
        } else {
            for (int count = 1; count <= number_of_item; count++) {
                unitCount += this.unitSold;
            }
            double percentage = percent / 100;
            result = 200 + percentage * unitCount;
        }

        return result;

    }



}

