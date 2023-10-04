package practise;

import java.util.Scanner;

public class Nokia1 {

    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.phonebook
                2. message
                3.chat
                4. call register
                5. tones
                6. settings
                7. call divert
                8. games
                9. calculator
                10.  reminders
                11 clock
                12 profiles
                13. sim service
                 """);
        int userInput  = scanner.nextInt();
        switch (userInput){
            case 1:
                phonebook();
        }

    }
    public static void phonebook(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("""
                1. search
                2. service nos
                3. add name
                4. erase
                5. edit
                6. assign tone
                7. send b'card 
                8. option
                9. speed dials
                10.  voice tag
                11. main menu
                 """);
        int userinput = scanner.nextInt();
        switch(userinput){
            case 1:
                System.out.println("search");
                break;

            case 2:
                System.out.println("Service nos");
                break;

            case 3:
                System.out.println("add name");
                break;

            case 4:
                System.out.println("erase");
                break;

            case 5:
                System.out.println("edit");
                break;

            case 6:
                System.out.println("assign tone");
                break;

            case 7:
                System.out.println("send b'card");
                break;

            case 8:
                System.out.println("""
                        1. type of view
                        2. memory status
                        3.go back
                        4.main menu
                        """);
                int userInput1 = scanner.nextInt();
                switch(userInput1){
                    case 1:
                        System.out.println("type of view");
                        break;
                    case 2:
                        System.out.println("memory status");
                        break;
                    case  3:
                        phonebook();
                    case 4:
                        mainMenu();
                }



        }
    }

}
