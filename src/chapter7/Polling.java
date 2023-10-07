package chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lqbt = new ArrayList<>();
        ArrayList<Integer> mentalHealth = new ArrayList<>();
        ArrayList<Integer>  healthCareAccess = new ArrayList<>();
        ArrayList<Integer> dataSecurity = new ArrayList<>();
        ArrayList<Integer> gunControl = new ArrayList<>();
        String[] socialIssues = {"LQBTQ RIGHT", "MENTAL HEALTH", "HEALTHCARE ACCESS", "DATA INSECURITY", "GUN CONTROL"};
      int[] response = new int[10];
      System.out.println("""
               on the rate of 1 - 10,where 1 is the least important and 10 is the most important,
                          Kindly rate the issue""");
      for (int number = 0; number < socialIssues.length; number++) {
          for (int numb = 1; numb < response.length; numb++) {
               response[numb] = numb;
           }
          System.out.println(socialIssues[number] + " " + Arrays.toString(response));
            int input = scanner.nextInt();
            switch (number){
                case 0: {
                    lqbt.add(input);
                    break;
                }
                case 1: {
                    mentalHealth.add(input);
                    break;
                }
                case 2: {
                    healthCareAccess.add(input);
                    break;
                }
                case 3: {
                    dataSecurity.add(input);
                    break;
                }
                case 4: {
                    gunControl.add(input);
                    break;
                }

            }

        }
        System.out.println(lqbt);
        System.out.println(mentalHealth);
        System.out.println(healthCareAccess);
        System.out.println(gunControl);
        System.out.println(dataSecurity);


    }

}






















