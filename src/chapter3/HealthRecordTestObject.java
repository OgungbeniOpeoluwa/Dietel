package chapter3;

import java.util.Scanner;

public class HealthRecordTestObject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HealthRecord health = new HealthRecord("joy", "joseph", "female",   23, "july",1999,50,65);

        System.out.println("Enter your first name : ");
        String firstname = scanner.nextLine();
        health.setName(firstname);

        System.out.println("Kindly enter your surname: ");
        String surname = scanner.nextLine();
        health.setSurname(surname);

        System.out.println("kindly enter your birthday date :");
        int dateOfBirth = scanner.nextInt();
        health.setDateOfBirth(dateOfBirth);

        System.out.println("kindly enter your birthday month in word : ");
        String monthOfBirthday = scanner.next();
        health.setMonthOfBirth(monthOfBirthday);

        System.out.println("Kindly enter your birth year: ");
        int yearOfBirth = scanner.nextInt();
        health.setYearOfBirth(yearOfBirth);

        System.out.println("Kindly enter your Gender : ");
        String myGender = scanner.next();
        health.setGender(myGender);

        System.out.println("Kindly enter your weight in pounds : ");
        int weightInPounds = scanner.nextInt();
        health.setWeight(weightInPounds);

        System.out.println("Kindly enter your height in inches : ");
        int height = scanner.nextInt();
        health.setHeight(height);

        System.out.printf("Name : %s %s%n", health.getSurname(), health.getFirstname());
        System.out.println("Gender: " + health.gender());
        System.out.printf("%s %d %s %d%n", "Date of Birth : ", health.getDateOfBirth(), health.getMonthOfBirth(), health.getYearOfBirth());
        System.out.println("Weight : " + health.getWeight());
        System.out.println("Height : " + health.getHeight());
        System.out.println("Enter current year: ");
        int year = scanner.nextInt();
        health.ageCaculator(year);
        health.maximumHeartRate();
        health.bodyMassIndex();
        System.out.println("Kindly confirm your Detail : ");
        System.out.println();
        System.out.printf("Name : %s %s%n", health.getSurname(), health.getFirstname());
        System.out.printf("%s %d %s %d%n", "Date of Birth : ", health.getDateOfBirth(), health.getMonthOfBirth(), health.getYearOfBirth());
        System.out.printf("Current Age In Year : %d%n", health.ageCaculator(2023));
        System.out.println();

        System.out.println("Body mass categories");
        System.out.println("Normal weight = 18.5 _ 24.9");
        System.out.println("Underweight = <18.5");
        System.out.println("Overweight = 25 _ 29.9");
        System.out.println("obesity = 30 >="  + " that is greater than or equal to 30");


        System.out.printf("Body Mass iIndex : %d%n ", health.bodyMassIndex());
        System.out.println();
        System.out.printf("Maximum Heart rate Caculator : %f%n", health.maximumHeartRate());

        System.out.println(" Moderate intensity Physical activity is between 50% and 65%");
        System.out.println("For vigorous intesity excersice is within 70% && 85%");

        System.out.println("Enter your  desire training intesity : ");
        double excersise = scanner.nextInt();

        health.targetHeart(excersise);

        System.out.println("Enter second desire training intesity: ");
        double excerise2 = scanner.nextInt();
        health.targetHeart(excerise2);

        System.out.println();

        System.out.printf("Your target heart rate is %.2fbmp - %.2fbmp%n" ,health.targetHeart(excersise), health.targetHeart(excerise2) );



    }
}


