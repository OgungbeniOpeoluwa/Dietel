package chibuzorAssignment;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        mainMenu();

    }






        public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                press:
                1. phoneBook
                2. messages
                3. chat
                4. callRegister
                5. tones
                6. settings
                7. call divert
                8. games
                9. calculator
                10. remainder
                11. clock
                12. profiles
                13. simServices
                14. exit
                
                """);
        int userInput = scanner.nextInt();
                switch(userInput){
                    case 1:
                        System.out.println("phoneBook");
                        NokiaTest.phoneBook();
                        break;

                    case 2:
                        System.out.println("message");
                        NokiaTest.message();
                        break;

                    case 3:
                        System.out.println("Chat");
                        NokiaTest.chat();
                        break;

                    case 4:
                        System.out.println("Call Register");
                        NokiaTest.callRegister();
                        break;

                    case 5:
                        System.out.println("Tones");
                        NokiaTest.tones();
                        break;

                    case 6:
                        System.out.println("Setting");
                        NokiaTest.settings();
                        break;

                    case 7 :
                        System.out.println("Call Divert");
                        NokiaTest.callDivert();
                        break;

                    case 8:
                        System.out.println("Games");
                        NokiaTest.games();
                                break;

                    case 9:
                        System.out.println("Calculator");
                        NokiaTest.calculator();
                        break;

                    case 10:
                        System.out.println("Reminders");
                        NokiaTest.reminders();
                        break;

                     case 11:
                         System.out.println("Clock");
                         NokiaTest.clock();
                         break;

                    case 12:
                        System.out.println("Profiles");
                        NokiaTest.profiles();
                        break;

                    case 13:
                        System.out.println("SIM Services");
                        NokiaTest.simServices();
                        break;

                    default:
                        if(userInput == 14)
                            break;
                }



        }

    }



