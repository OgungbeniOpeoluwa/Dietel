package liangExcersise;

import java.util.Scanner;

public class GuessCapital {
    static String[][] states = {{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"California", "Sacramento",},
            {"Florida", "Tallahassee"}, {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Pennsylvania", "Harrisburg"},
            {"SouthCarolina", "Columbia"}, {"Oregon", "Salem"}, {"Texas", "Austin"}, {"NewYork", "Albany"},
            {"Delaware", "Dover"}, {"Nebraska", "Lincoln"}, {"Montana", "Helena"}, {"Kansas", "Topeka"},
            {"Maine", "Augusta"}, {"Iowa", "Des Moines"}, {"Idaho", "Boise"}, {"Arizona", "Phoenix"},
            {"Colorado", "Denver"}, {"Georgia", "Atlanta"}, {"Connecticut", "Hartford"}, {"New Jersey", "Trenton"},
            {"Illinois", "SpringField"}, {"Minnesota", "St Paul"}, {"SouthDakota", "Pierre"}, {"Wyoming", "Cheyenne"},
            {"West Virginia", "Charleston"}, {"Virginia", "Richmond"}, {"Kentucky", "FrankFort"}, {"Hawaii", "Honolulu"},
            {"Louisiana", "Baton Rouge"}, {"MaryLand", "Annapolis"}, {"Michigan", "Lansing"}, {"Missouri", "Jefferson City"},
            {"Nevada", "Carson City"}, {"North Carolina", "Raleigh"}, {"Oklahoma", "Oklahoma City"}, {"Utah", "Salt Lake City"},
            {"Washington", "Olympia"}, {"Vermont", "Montpelier"}, {"Wisconsin", "Madison"}, {"Massachusetts", "Boston"},
            {"New Hampshire", "Concord"}, {"New Mexico", "Santa Fe"}, {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"},
            {"Rhodes Island", "Providence"}, {"Tennessee", "Nashville"}, {"Mississippi", "Jackson"}};

    public static int displayQuestion() {
        int counter = 0;
        System.out.println("There are 50 states and capital from united,enter the capital of each states");
        for (int count = 0; count < states.length; count++) {
            System.out.println("What is the capital of " + states[count][0]);
            String answer = collectInput();
            if (answer.equalsIgnoreCase(states[count][1])) {
                System.out.println(" Your answer is correct");
                counter++;
            }
            else {
                System.out.println("The correct answer should be " + states[count][1]);
            }
        }
        return counter;
    }


    public static String collectInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}