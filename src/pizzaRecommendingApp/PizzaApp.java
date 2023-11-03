package pizzaRecommendingApp;

import java.util.Scanner;

public class PizzaApp {

    public int setSlice(String slices){
        String size = slices.toUpperCase();
        int slice;
        switch(size){
            case "BIG" -> slice = 10;
            case "MEDIUM" -> slice = 6;
            case "SMALL" -> slice = 4;
            default -> throw new IllegalArgumentException("Invalid input");
        }
        return slice;
    }

    public int setPrice(String size){
        String sizes = size.toUpperCase();
        int price;
        switch(sizes){
            case "BIG" -> price = 5000;
             case "MEDIUM" -> price = 4000;
            case "SMALL" -> price = 1200;
            default -> throw new IllegalArgumentException("Invalid Input");
        }
        return price;
    }
    public int getSlice(String slice){
        return setSlice(slice);
    }
    public  int getPrice(String price){
        return setPrice(price);
    }


    public int setOfPeople(String typeOfPeople) {
        String typeOfPeopleAvailable = typeOfPeople.toUpperCase();
        int stomachSize;
        switch (typeOfPeopleAvailable){
            case "HUNGRY" -> stomachSize = 2;
            case "SUPER HUNGRY" -> stomachSize = 4;
            case  "CLASSIC" -> stomachSize = 1;
            default -> throw new IllegalArgumentException("Invalid Input");
        }
        return stomachSize;
    }
    public  int getStomachSize(String typeOfPeople){
        return setOfPeople(typeOfPeople);
    }
    public int getNumberOfPeopleSlice(int numberOfPeople ,String typeOfPeople){
        return  getStomachSize(typeOfPeople) * numberOfPeople;
    }

    public int getTotalNumberOfSlice(String [][] typeOfPeople) {
        int total = 0;
        for(int count = 0;count < typeOfPeople.length;count++){
            String type = typeOfPeople[count][0];
            int numberOfSlices = Integer.parseInt(typeOfPeople[count][1]);
               total += getNumberOfPeopleSlice(numberOfSlices,type);
        }

        return total;
    }

    public int getTotalNumberOfBoxes(String typeOfBox, String[][] typeOfPeople) {
        int total = getTotalNumberOfSlice(typeOfPeople);
        int slice = getSlice(typeOfBox);
        int result  = 0;
        if(total % slice != 0){
            int number = total / slice;
            result = number + 1;
        }
        else{
            result = total / slice;
        }
        return result;
    }

    public int getNumberOfSlicesRemain(String typeOfBox, String[][] typeOfPeople) {
        int numberOfBoxes = getTotalNumberOfBoxes(typeOfBox, typeOfPeople);
        int totalNumberOfSlice = getTotalNumberOfSlice(typeOfPeople);
        int actualSlice = getSlice(typeOfBox);
        int result = numberOfBoxes * actualSlice;
        return result - totalNumberOfSlice;
    }

    public int getTotalPriceOfOrder(String typeOfBox, String[][] typeOfPeople) {
        int numberOfBoxes = getTotalNumberOfBoxes(typeOfBox,typeOfPeople);
        return getPrice(typeOfBox)*numberOfBoxes;
    }

}