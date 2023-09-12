package chibuzorAssignment;

import java.util.Random;
import java.util.Scanner;

public class NokiaTest {
    public static void phoneBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                press
                1. Search
                2. ServiceNos
                3. AddName
                4. Erase
                5. Edit
                6. Assign Tone
                7. Send b'Card
                8. Options
                9. Speed
                10. Voice Tags
                11.Main Menu
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("search");
                break;

            case 2:
                System.out.println("service nos");
                break;

            case 3:
                System.out.println("add name");
                break;

            case 4:
                System.out.println("edit");
                break;

            case 5:
                System.out.println("Edit");
                break;

            case 6:
                System.out.println("Assign Tone");
                break;

            case 7:
                System.out.println("send b' card");
                break;

            case 8:
                System.out.println("""
                        if you like to continue, 
                        press
                        1. Type Of View
                        2. Memory Status
                        3. Go Back
                        4.Main Menu
                        """);
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("type Of View on mode");
                        break;
                    case 2:
                        System.out.println("memory Status on mode");
                        break;

                    case 3:
                        phoneBook();

                    case 4:
                        Nokia.mainMenu();

                }
            case 9:
                System.out.println("Speed dial");
                break;

            case 10:
                System.out.println("voice tags");
                break;

            case 11:
                Nokia.mainMenu();
        }

    }

    public static void message() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. write messages
                2. inbox
                3. outbox
                4. picture messages
                5.Templates
                6.smileys
                7.message settings
                8.info service 
                9. voice mail
                10.service command editor
                11. Main Menu
                """);
        int message = scanner.nextInt();
        switch (message) {
            case 1:
                System.out.println("Write message");
                break;

            case 2:
                System.out.println("Inbox");
                break;

            case 3:
                System.out.println("OutBox");
                break;

            case 4:
                System.out.println("Picture Messages");
                break;

            case 5:
                System.out.println("Templates");
                break;

            case 6:
                System.out.println("Smiley");
                break;

            case 7:
                System.out.println("Message Setting");
                System.out.println("""
                        1. Set1
                        2. common
                        3.Go back
                        4.main menu""");
                int setting = scanner.nextInt();

                switch (setting) {
                    case 1:
                        System.out.println("""
                                1. Message center Number
                                2.Message sent as
                                3.Message validity
                                4. Go back
                                5.main menu""");
                        int settings = scanner.nextInt();
                        switch (settings) {
                            case 1:
                                System.out.println("Message Center Number");
                                break;

                            case 2:
                                System.out.println("Message Sent as");
                                break;

                            case 3:
                                System.out.println("Message Validity");
                                break;

                            case 4:
                                message();

                            case 5:
                                Nokia.mainMenu();

                        }

                    case 2:
                        System.out.println("""
                                1.Delivery Report
                                2.Reply Via Same Center
                                3.Character support
                                4.go back
                                5.main menu""");
                        int common = scanner.nextInt();
                        switch (common) {
                            case 1:
                                System.out.println("Delivery Report");
                                break;

                            case 2:
                                System.out.println("Reply Via Same Center");
                                break;

                            case 3:
                                System.out.println("Character support");
                                break;

                            case 4:
                                message();

                            case 5:
                                Nokia.mainMenu();
                                break;
                        }

                    case 3:
                        message();

                    case 4:
                        Nokia.mainMenu();

                }

            case 8:
                System.out.println("Info Services");
                break;

            case 9:
                System.out.println("Voice MailBox Number");
                break;

            case 10:
                System.out.println("Service Command Editor");
                break;

            case 11:
                Nokia.mainMenu();

        }


    }

    public static void chat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Chat
                2. Main Menu""");
        int chats = scanner.nextInt();
        switch (chats) {
            case 1:
                System.out.println("Chat");
                break;

            case 2:
                Nokia.mainMenu();
        }


    }

    public static void callRegister() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                press
                1. Missed call
                2. Recieve call
                3. Dialled Numbers
                4. Erase recent call list
                5. Show Call Duration
                6. Show call Costs
                7. Call Cost Setting
                8. Prepaid Credit
                9.Main Menu
                """);
        int call = scanner.nextInt();
        switch (call) {
            case 1:
                System.out.println("Missed Call");
                break;

            case 2:
                System.out.println("Recieve Call");
                break;

            case 3:
                System.out.println("Dialled Numbers");
                break;

            case 4:
                System.out.println("Erase Recent Call List");
                break;

            case 5:
                System.out.println("""
                        1. Last Call Duration
                        2. All Call's Duration
                        3. Receive Call's Duration
                        4. Dialled Call Duration
                        5. Clear Timers
                        6. Go Back
                        7. Main Menu""");
                int duration = scanner.nextInt();
                switch (duration) {
                    case 1:
                        System.out.println("Last Call Duration");
                        break;

                    case 2:
                        System.out.println("All Call's Duration");
                        break;

                    case 3:
                        System.out.println("Receive Call Duration");
                        break;

                    case 4:
                        System.out.println("Dialled Call Duration");
                        break;
                    case 5:
                        System.out.println("Clear Timers");
                        break;

                    case 6:
                        callRegister();

                    case 7:
                        Nokia.mainMenu();
                }
            case 6:
                System.out.println("""
                        1. Last Call Cost
                        2.All Call Cost
                        3.Clear Counters
                        4.Go Back
                        5. MAin Menu""");
                int callCost = scanner.nextInt();
                switch (callCost) {
                    case 1:
                        System.out.println("Last Call Cost");
                        break;

                    case 2:
                        System.out.println("All Call Cost");
                        break;

                    case 3:
                        System.out.println("Clear Counters");
                        break;

                    case 4:
                        callRegister();

                    case 5:
                        Nokia.mainMenu();


                }

            case 7:
                System.out.println("""
                        1. Call Cost Limit
                        2. Show Cost In
                        3. Go Back
                        4. Main Menu""");
                int showCall = scanner.nextInt();
                switch (showCall) {
                    case 1:
                        System.out.println("Call Cost Limit");
                        break;

                    case 2:
                        System.out.println("Show Cost In");
                        break;

                    case 3:
                        callRegister();

                    case 4:
                        Nokia.mainMenu();

                }
            case 8:
                System.out.println("Prepaid Credit");
                break;

            case 9:
                Nokia.mainMenu();


        }
    }

    public static void tones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                press
                1. Ringing Tone
                2. Ringing Volume
                3. Incoming Call Alert
                4. Composer
                5. Message Alert Tone
                6. Keypad Tones
                7. Warning and Game Tones
                8. Vibrating Alert
                9. Screen Saver
                10. Main Menu
                """);
        int tone = scanner.nextInt();
        switch (tone) {
            case 1:
                System.out.println("Ringing Tones");
                break;

            case 2:
                System.out.println("Ringing Volume");
                break;

            case 3:
                System.out.println("Incoming Call Alert");
                break;

            case 4:
                System.out.println("Composer");
                break;

            case 5:
                System.out.println("Message Alert Tone");
                break;

            case 6:
                System.out.println("Keypad Tones");
                break;

            case 7:
                System.out.println(" Warning and Game Tones");
                break;

            case 8:
                System.out.println("Vibrating Alert");
                break;

            case 9:
                System.out.println("Screen Saver");
                break;

            case 10:
                Nokia.mainMenu();


        }
    }

    public static void settings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Call Setting
                2. Phone Setting
                3. Security Setting
                4. Restore Factory Settings
                5. Main Menu
                """);
        int setting = scanner.nextInt();
        switch (setting) {
            case 1:
                System.out.println("""
                        1. Automatic Redial
                        2. Speed Dialing
                        3. Call Waiting Option
                        4. Own Number Sending
                        5. Phone line in use
                        6. Automatic Answer
                        7. Go Back
                        8. Main Menu""");
                int user = scanner.nextInt();
                switch (user) {
                    case 1: {
                        System.out.println("Automatic Redial");
                        break;
                    }

                    case 2: {
                        System.out.println("Speed Dialing");
                        break;
                    }

                    case 3: {
                        System.out.println("Call Waiting Option");
                        break;
                    }

                    case 4: {
                        System.out.println("Own Number Sending");
                        break;
                    }

                    case 5: {
                        System.out.println("Phone line in use");
                        break;
                    }

                    case 6: {
                        System.out.println("Automatic Answer");
                        break;
                    }

                    case 7: {
                        settings();
                    }

                    case 8: {
                        Nokia.mainMenu();
                    }

                }
                    break;
            case 2:{
                System.out.println("""
                        1.Language
                        2. Cell Waiting Options
                        3. Welcome Note
                        4. Network Selection
                        5. Lights
                        6. Confirm Sim Service Action
                        7. Go Back
                        8. Main Menu""");
                int phoneSettings = scanner.nextInt();
                switch (phoneSettings) {
                    case 1:
                        System.out.println("Language");
                        break;

                    case 2:
                        System.out.println(" Cell Waiting Options");
                        break;

                    case 3:
                        System.out.println(" Welcome Note");
                        break;

                    case 4:
                        System.out.println("Network Selection");
                        break;

                    case 5:
                        System.out.println("Lights");
                        break;

                    case 6:
                        System.out.println("Confirm Sim Service Action");
                        break;

                    case 7:
                        settings();

                    case 8:
                        Nokia.mainMenu();
                }
                }

            case 3:
                System.out.println("""
                        1. Pin Code Request
                        2. Call Barring Service
                        3. Fixed Dialling
                        4. Closed User Group
                        5. Phone Security
                        6. Change Access Code
                        7. Go back
                        8. Main Menu""");
                int securitySetting = scanner.nextInt();
                switch (securitySetting) {
                    case 1:
                        System.out.println("Pin Code Request");
                        break;

                    case 2:
                        System.out.println("Call Barring Service");
                        break;

                    case 3:
                        System.out.println("Fixed Dialling");
                        break;

                    case 4:
                        System.out.println("Closed User Group");
                        break;

                    case 5:
                        System.out.println(" Phone Security");
                        break;

                    case 6:
                        System.out.println("Change Access Code");
                        break;

                    case 7:
                        settings();

                    case 8:
                        Nokia.mainMenu();
                }
            case 4:
                System.out.println("Restore Factory");
                break;

            case 5:
                Nokia.mainMenu();


        }
    }

    public static void callDivert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Call Divert
                2. Main Menu""");
        int divert = scanner.nextInt();
        switch (divert) {
            case 1:
                System.out.println("Call Divert");
                break;

            case 2:
                Nokia.mainMenu();
        }


    }

    public static void games() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Games
                2. Main Menu""");
        int game = scanner.nextInt();
        switch (game) {
            case 1:
                System.out.println("""
                        1.Rock,paper,scissor
                        2.go back""");
                Scanner guess = new Scanner(System.in);
                int games2 = guess.nextInt();

                switch (games2) {
                    case 1:
                        guessGame();
                        System.out.println(" will you like to continue, if yes press 1 , if press 0 to go back:");
                        int number5 = guess.nextInt();
                        if (number5 == 1){
                            guessGame();
                        }
                        else{
                            games();

                        }
                        break;
                    case 2:
                        games();
                }

                    break;
            case 2:
                Nokia.mainMenu();
        }











    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Calculator
                2. Main Menu""");
        int calculator = scanner.nextInt();
        switch (calculator) {
            case 1:
                System.out.println("Calculator");
                break;

            case 2:
                Nokia.mainMenu();
        }

    }

    public static void reminders() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Reminders
                2. Main Menu""");
        int reminder = scanner.nextInt();
        switch (reminder) {
            case 1:
                System.out.println("Reminders");
                break;

            case 2:
                Nokia.mainMenu();
        }

    }

    public static void clock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Alarm Clock
                2. Clock Settings
                3. Date Setting
                4. Stop Watch
                5. CountDown timer
                6. Auto Update Of Date And Time
                7. Main Menu""");
        int clockSetting = scanner.nextInt();
        switch (clockSetting) {
            case 1:
                System.out.println("Alarm Clock");
                break;

            case 2:
                System.out.println("Clock Setting");
                break;

            case 3:
                System.out.println("Date Setting");
                break;

            case 4:
                System.out.println("Stop Watch");
                break;

            case 5:
                System.out.println("CountDown timer");
                break;

            case 6:
                System.out.println("Auto Update Of Date And Time");
                break;

            case 7:
                Nokia.mainMenu();
        }
    }

    public static void profiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Profiles
                2. Main Menu""");
        int profiles = scanner.nextInt();
        switch (profiles) {
            case 1:
                System.out.println("Profiles");
                break;

            case 2:
                Nokia.mainMenu();
        }

    }

    public static void simServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Sim Services
                2. Main Menu""");
        int service = scanner.nextInt();
        switch (service) {
            case 1:
                System.out.println("SIM Service");
                break;

            case 2:
                Nokia.mainMenu();


        }
    }

    public static void guessGame(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("scissor (0) , rock (1), paper (2) : ");
        int number = scanner.nextInt();
        int randomNumber = random.nextInt(3);

        int scissor = 0;
        int rock = 1;
        int paper = 2;

        if (number == randomNumber && number == scissor) {
            System.out.println("Computer is paper, you are scissor too. it is a draw");
        } else if (number == randomNumber && number == paper) {
            System.out.println("Computer is paper, you are paper too. it is a draw");
        } else if (number == randomNumber && number == rock) {
            System.out.println("Computer is Rock , you are Rock too. it is a draw");
        }

        if (number == rock && randomNumber == paper) {
            System.out.println("The computer is paper, you are rock: Computer won");
        } else if (number == paper && randomNumber == scissor) {
            System.out.println("Computer is Scissor, you are papper: Computer won");
        } else if (number == scissor && randomNumber == rock) {
            System.out.println("Computer is Rock, you are scissor: Computer won");
        }

        if (number == paper && randomNumber == rock) {
            System.out.println("Computer is rock, you are paper: Congratulation you won");
        } else if (number == rock && randomNumber == scissor) {
            System.out.println("Computer is Scissor, you are Rock : Congratulation you won");
        } else if (number == scissor && randomNumber == paper) {
            System.out.println("computer is papper, you are scissor : Congratulation you won");
        }


    }
}
