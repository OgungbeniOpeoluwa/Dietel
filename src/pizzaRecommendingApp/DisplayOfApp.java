package pizzaRecommendingApp;

import java.util.Scanner;

public class DisplayOfApp {
    private String [][] arrays = {{"SUPER HUNGRY","0"},{"HUNGRY", "0"},{"CLASSIC","0"}};
    PizzaApp pizza = new PizzaApp();

    public void displayAvailableBoxes(){
        for (PizzaAppConstant result : PizzaAppConstant.values()) {
            System.out.println(result);
        }
    }


    public void  customersOrderInputs(){
        for(int count = 0; count < arrays.length;count++){
            System.out.print(arrays[count][0] + " : " );
            String userInput = collectInput();
            arrays[count][1] = userInput;

        }
    }
    public void checkInput() {
        displayAvailableBoxes();
        System.out.println();
        String input = sizePreferred();
        if ((input.equalsIgnoreCase("BIG") || input.equalsIgnoreCase("MEDIUM") || input.equalsIgnoreCase("SMALL"))) {
            customersOrderInputs();
            String[][] orders = arrayOfOrders();
            displayOrder(input, orders);

        }
        else{
            throw new IllegalArgumentException("Invalid Input");
        }
    }
    public String sizePreferred(){
        System.out.println("Enter your Preferred Box size among the available pizza size listed above: ");
        return collectInput();
    }
    public String[][] arrayOfOrders(){
        return arrays;
    }
    private String collectInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public void displayOrder(String typeOfBox,String[][] typeOfPeople){
        System.out.println("Number of Slices needed: "+ pizza.getTotalNumberOfSlice(typeOfPeople));
        System.out.println("Number of boxes: " + pizza.getTotalNumberOfBoxes(typeOfBox,typeOfPeople));
        System.out.println("Number of slices left: " + pizza.getNumberOfSlicesRemain(typeOfBox,typeOfPeople));
        System.out.println("Total Price: " + pizza.getTotalPriceOfOrder(typeOfBox,typeOfPeople));

    }
}
