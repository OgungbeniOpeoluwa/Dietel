package chapter6;

import java.util.Scanner;

public class SportRecommendation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celesius Temperature to check Weather : ");
        int input = scanner.nextInt();
        displayTempratureWeather(input);
    }
    public static void displayTempratureWeather(int celesiusTempeature){
        boolean result = isWeather(celesiusTempeature);
        if(result)System.out.println("“It’s lovely weather for sports today!");
        else System.out.println("Please exercise with care today, watch out for the weather!");



    }

    public static boolean isWeather(int celesiusTempeature) {
        boolean answer = false;
        if(celesiusTempeature >=20 && celesiusTempeature<= 30)answer = true;
        else if(celesiusTempeature >= 10 && celesiusTempeature <= 40)return answer;
        return  answer;
    }
}
