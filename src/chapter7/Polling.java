package chapter7;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello,This a Social issue polling unit,kindly press (1) to continue or press (0) to log out");
        int stoper = scanner.nextInt();
        ArrayList<Integer> lqbt = new ArrayList<>();
        ArrayList<Integer> mentalHealth = new ArrayList<>();
        ArrayList<Integer>  healthCareAccess = new ArrayList<>();
        ArrayList<Integer> dataSecurity = new ArrayList<>();
        ArrayList<Integer> gunControl = new ArrayList<>();
        int total = 0;
        int result = 0;
        int counts = 0;
        int numb = 0;
        int results = 0;
        int count = 0;
        String[] socialIssues = {"LQBTQ RIGHT", "MENTAL HEALTH", "HEALTHCARE ACCESS", "DATA INSECURITY", "GUN CONTROL"};
      int[] response = new int[10];
      while (stoper != 0) {
          System.out.println("""
                  on the rate of 1 - 10,where 1 is the least important and 10 is the most important,
                             Kindly rate the issue""");
          for (int number = 0; number < socialIssues.length; number++) {
              for (int numbss = 1; numbss < response.length; numbss++) {
                  response[numbss] = numbss;
              }
              System.out.println(socialIssues[number] + " " + Arrays.toString(response));
              int input = scanner.nextInt();
              switch (number) {
                  case 0 -> {
                      lqbt.add(input);
                      total += input;
                  }
                  case 1 -> {
                      mentalHealth.add(input);
                      result += input;
                  }
                  case 2 -> {
                      healthCareAccess.add(input);
                      counts += input;
                  }
                  case 3 -> {
                      dataSecurity.add(input);
                      numb += input;
                  }
                  case 4 -> {
                      gunControl.add(input);
                      results += input;
                  }
              }

          }
          count++;
          System.out.println("Hello,This a Social issue polling unit,kindly press (1) to continue or press (0) to log out");
          stoper = scanner.nextInt();
      }
      total/=count;
      result/=count;
      count/= count;
      numb/= count;
      results/=numb;

        System.out.print("LQBT:  " );
                 for(int numbs : lqbt){
                     System.out.print(numbs + "  " + " " + " ");
                 }
        System.out.print(total);
        System.out.println();
        System.out.print("MENTAL HEALTH CARE :  ");
                 for(int numbs : mentalHealth){
                    System.out.print(numbs + "  " + " "+ " ");
                }
        System.out.print(result);
        System.out.println();
        System.out.print("HEALTH CARE ACCESS:  ");
                for(int numbs : healthCareAccess){
                    System.out.print(numbs + "  " + " ");
                }
        System.out.print(count);
        System.out.println();
        System.out.print("DATA SECURITY:  ");
                for(int numbs : dataSecurity){
                    System.out.print(numbs + "  " + " ");
                }
        System.out.print(numb);
        System.out.println();
        System.out.print("GUN CONTROL:  ");
                for(int numbs : gunControl){
                    System.out.print(numbs + "  " + " ");
                }
        System.out.print(results);


    }

}
