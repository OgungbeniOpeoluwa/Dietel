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
                System.out.println("Press 1 to go back to main menu or press 0 to exit: ");
                int users = scanner.nextInt();
                while(users != 1 && users != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to phonebook menu or press 0 to exit: ");
                    users = scanner.nextInt();
                }
                if(users == 1){
                    phoneBook();
                }
                else{
                    break;
                }
                break;

            case 2:
                System.out.println("service nos");
                System.out.println("Press 1 to go back to main menu or press 0 to exit: ");
                int user_1 = scanner.nextInt();
                while(user_1 != 1 && user_1 != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to phonebook menu or press 0 to exit: ");
                    user_1 = scanner.nextInt();
                }
                if(user_1 == 1){
                    phoneBook();
                }
                else{
                    break;
                }

                break;

            case 3:
                System.out.println("add name");
                System.out.println("Press 1 to go back to main menu or press 0 to exit : ");
                int userss = scanner.nextInt();
                while(userss != 1 && userss != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to phonebook  menu or press 0 to exit: ");
                    userss = scanner.nextInt();
                }
                if(userss == 1){
                    phoneBook();
                }
                else{
                    break;
                }
                break;

            case 4:
                System.out.println("edit");
                System.out.println("Press 1 to go back to main menu or press 0 to exit: ");
                int usersf = scanner.nextInt();
                while(usersf != 1 && usersf != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to main menu or press 0 to exit: ");
                    usersf = scanner.nextInt();
                }
                if(usersf == 1){
                    phoneBook();
                }
                else{
                    break;

                }
                break;

            case 5:
                System.out.println("Edit");
                System.out.println("Press 1 to go back to main menu or press 0 to exit: ");
                int userst = scanner.nextInt();
                while(userst != 1 && userst != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to main menu or press 0 to exit: ");
                    userst = scanner.nextInt();
                }
                if(userst == 1){
                    phoneBook();
                }
                else{
                    break;

                }
                break;

            case 6:
                System.out.println("Assign Tone");
                System.out.println("Press 1 to go back to main menu or press 0 to exit: ");
                int usersj = scanner.nextInt();
                while(usersj != 1 && usersj != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to main menu or press 0 to exit: ");
                    usersj = scanner.nextInt();

                }
                if(usersj == 1){
                    phoneBook();
                }
                else{
                    break;
                }
                break;

            case 7:
                System.out.println("send b' card");
                System.out.println("Press 1 to go back to phone book menu or press 0 to exit: ");
                int usersm = scanner.nextInt();
                while(usersm != 1 && usersm != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to phoneBook menu or press 0 to exit: ");
                    usersm = scanner.nextInt();

                }
                if(usersm == 1){
                    phoneBook();
                }
                else{
                    break;

                }
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
                        System.out.println("Press 1 to go back to main menu or press 0 to exit: ");
                        int usersk = scanner.nextInt();
                        while(usersk != 1 && usersk != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to main menu or press 0 to exit: ");
                            usersk = scanner.nextInt();

                        }
                        if(usersk == 1){
                            phoneBook();
                        }
                        else{
                            break;

                        }
                        break;
                    case 2:
                        System.out.println("memory Status on mode");
                        System.out.println("Press 1 to go back to main menu or press 0 to exit: ");
                        int usersp = scanner.nextInt();
                        while(usersp != 1 && usersp != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to main menu or press 0 to exit: ");
                            usersp = scanner.nextInt();

                        }
                        if(usersp == 1){
                            phoneBook();
                        }
                        else{
                            break;

                        }
                        break;

                    case 3:
                        phoneBook();

                    case 4:
                        Nokia.mainMenu();

                }
                break;
            case 9:
                System.out.println("Speed dial");
                System.out.println("Press 1 to go back to phone book menu or press 0 to exit: ");
                int usersu = scanner.nextInt();
                while(usersu != 1 && usersu != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to phone book menu or press 0 to exit: ");
                    usersu = scanner.nextInt();

                }
                if(usersu == 1){
                    phoneBook();
                }
                else{
                    break;

                }
                break;

            case 10:
                System.out.println("voice tags");
                System.out.println("Press 1 to go back to phone book menu or press 0 to exit: ");
                int usersq = scanner.nextInt();
                while(usersq != 1 && usersq != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to phone book menu or press 0 to exit: ");
                    usersq = scanner.nextInt();

                }
                if(usersq == 1){
                    phoneBook();
                }
                else{
                    break;

                }
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
                System.out.println("Press 1 to go back to message menu or press 0 to exit ");
                int users = scanner.nextInt();
                while(users != 1 && users != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to phone book menu or press 0 to exit: ");
                    users = scanner.nextInt();
                }
                if(users == 1){
                    message();
                }
                else{
                    break;
                }
                break;

            case 2:
                System.out.println("Inbox");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int usersk = scanner.nextInt();
                while(usersk != 1 && usersk != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit : ");
                    usersk = scanner.nextInt();
                }
                if(usersk == 1){
                    message();
                }
                else{
                    break;
                }
                break;

            case 3:
                System.out.println("OutBox");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int usersq = scanner.nextInt();
                while(usersq != 1 && usersq != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                    usersq = scanner.nextInt();
                }
                if(usersq == 1){
                    message();
                }
                else{
                    break;
                }
                break;

            case 4:
                System.out.println("Picture Messages");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int userst = scanner.nextInt();
                while(userst != 1 && userst != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message  menu or press 0 to exit: ");
                    userst = scanner.nextInt();
                }
                if(userst == 1){
                    Nokia.mainMenu();
                }
                else{
                    break;
                }
                break;

            case 5:
                System.out.println("Templates");
                System.out.println("Press 1 to go back to main menu or press 0 to go back: ");
                int usersu = scanner.nextInt();
                while(usersu != 1 && usersu != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to main menu or press 0 to go back: ");
                    usersu = scanner.nextInt();

                }
                if(usersu == 1){
                    Nokia.mainMenu();
                }
                else{
                    break;

                }
                break;

            case 6:
                System.out.println("Smiley");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int usersl = scanner.nextInt();
                while(usersl != 1 && usersl != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                    usersl = scanner.nextInt();
                }
                if(usersl == 1){
                    message();
                }
                else{
                    break;
                }
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
                                System.out.println("Press 1 to go back to message menu or press 0 to exit : ");
                                int usersj = scanner.nextInt();
                                while(usersj != 1 && usersj != 0){
                                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to go back: ");
                                    usersj = scanner.nextInt();
                                }
                                if(usersj == 1){
                                    message();
                                }
                                else{
                                    break;
                                }
                                break;

                            case 2:
                                System.out.println("Message Sent as");
                                System.out.println("Press 1 to go back to message menu or press 0 to go back: ");
                                int users_ = scanner.nextInt();
                                while(users_ != 1 && users_ != 0){
                                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to go back: ");
                                    users_ = scanner.nextInt();
                                }
                                if(users_ == 1){
                                    message();
                                }
                                else{
                                    break;
                                }
                                break;

                            case 3:
                                System.out.println("Message Validity");
                                System.out.println("Press 1 to go back to message menu or press 0 to go back: ");
                                int users_p = scanner.nextInt();
                                while(users_p != 1 && users_p != 0){
                                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to go back: ");
                                    users_p = scanner.nextInt();

                                }
                                if(users_p == 1){
                                    message();
                                }
                                else{
                                    break;

                                }
                                break;

                            case 4:
                                message();

                            case 5:
                                Nokia.mainMenu();

                        }
                        break;

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
                                System.out.println("Press 1 to go back to message menu or press 0 to go back: ");
                                int users_t = scanner.nextInt();
                                while(users_t != 1 && users_t != 0){
                                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to go back: ");
                                    users_t = scanner.nextInt();
                                }
                                if(users_t == 1){
                                    message();
                                }
                                else {
                                    break;
                                }
                                break;

                            case 2:
                                System.out.println("Reply Via Same Center");
                                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                                int users_j = scanner.nextInt();
                                while(users_j != 1 && users_j != 0){
                                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                                    users_j = scanner.nextInt();

                                }
                                if(users_j == 1){
                                    message();
                                }
                                else {
                                    break;
                                }
                                break;

                            case 3:
                                System.out.println("Character support");
                                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                                int usersY = scanner.nextInt();
                                while(usersY != 1 && usersY != 0){
                                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                                    usersY = scanner.nextInt();
                                }
                                if(usersY == 1){
                                    message();
                                }
                                else {
                                    break;
                                }
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
                break;

            case 8:
                System.out.println("Info Services");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int usersD = scanner.nextInt();
                while(usersD != 1 && usersD != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                    usersD = scanner.nextInt();

                }

                if(usersD == 1){
                    message();
                }
                else {
                    break;
                }
                break;

            case 9:
                System.out.println("Voice MailBox Number");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int usersO = scanner.nextInt();
                while(usersO != 1 && usersO!= 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                    usersO= scanner.nextInt();
                }

                if(usersO == 1){
                    message();
                }
                else {
                    break;
                }
                break;

            case 10:
                System.out.println("Service Command Editor");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int usersF = scanner.nextInt();
                while(usersF != 1 && usersF != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                    usersF = scanner.nextInt();

                }

                if(usersF == 1){
                    message();
                }
                else {
                    break;
                }
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
                System.out.println("Press 1 to go back to chat menu or press 0 to exit: ");
                int user = scanner.nextInt();
                while(user != 1 && user != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to chat menu or press 0 to exit: ");
                     user = scanner.nextInt();
                }
                if(user == 1){
                    chat();
                }
                else{
                    break;
                }
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
                System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                int user = scanner.nextInt();
                while(user != 1 && user != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                    user = scanner.nextInt();
                }
                if(user == 1){
                    callRegister();
                }
                else{
                    break;
                }
                break;

            case 2:
                System.out.println("Recieve Call");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int userT = scanner.nextInt();
                while(userT != 1 && userT != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                    userT = scanner.nextInt();
                }
                if(userT == 1){
                    callRegister();
                }
                else{
                    break;
                }
                break;

            case 3:
                System.out.println("Dialled Numbers");
                System.out.println("Press 1 to go back to message menu or press 0 to exit: ");
                int userP = scanner.nextInt();
                while(userP != 1 && userP != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to message menu or press 0 to exit: ");
                    userP = scanner.nextInt();
                }
                if(userP == 1){
                    callRegister();
                }
                else{
                    break;
                }
                break;

            case 4:
                System.out.println("Erase Recent Call List");
                System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                int userG = scanner.nextInt();
                while(userG != 1 && userG != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                    userG = scanner.nextInt();
                }
                if(userG == 1){
                    callRegister();
                }
                else{
                    break;
                }
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
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userL = scanner.nextInt();
                        while(userL != 1 && userL != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userL = scanner.nextInt();
                        }
                        if(userL == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;

                    case 2:
                        System.out.println("All Call's Duration");
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userJ = scanner.nextInt();
                        while(userJ != 1 && userJ != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userJ = scanner.nextInt();
                        }
                        if(userJ == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;

                    case 3:
                        System.out.println("Receive Call Duration");
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userD = scanner.nextInt();
                        while(userD != 1 && userD != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userD = scanner.nextInt();
                        }
                        if(userD == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;

                    case 4:
                        System.out.println("Dialled Call Duration");
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int user1 = scanner.nextInt();
                        while(user1 != 1 && user1 != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            user1 = scanner.nextInt();
                        }
                        if(user1 == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;
                    case 5:
                        System.out.println("Clear Timers");
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userW = scanner.nextInt();
                        while(userW != 1 && userW != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userW = scanner.nextInt();
                        }
                        if(userW == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
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
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userK = scanner.nextInt();
                        while(userK != 1 && userK != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userK = scanner.nextInt();
                        }
                        if(userK == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;

                    case 2:
                        System.out.println("All Call Cost");
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userR = scanner.nextInt();
                        while(userR != 1 && userR != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userR = scanner.nextInt();
                        }
                        if(userR == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;

                    case 3:
                        System.out.println("Clear Counters");
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userO = scanner.nextInt();
                        while(userO != 1 && userO != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userO = scanner.nextInt();
                        }
                        if(userO == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
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
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int userQ = scanner.nextInt();
                        while(userQ != 1 && userQ != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            userQ = scanner.nextInt();
                        }
                        if(userQ == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;

                    case 2:
                        System.out.println("Show Cost In");
                        System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                        int user_ = scanner.nextInt();
                        while(user_ != 1 && user_ != 0){
                            System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                            user_ = scanner.nextInt();
                        }
                        if(user_ == 1){
                            callRegister();
                        }
                        else{
                            break;
                        }
                        break;

                    case 3:
                        callRegister();

                    case 4:
                        Nokia.mainMenu();

                }
            case 8:
                System.out.println("Prepaid Credit");
                System.out.println("Press 1 to go back to call register menu or press 0 to exit: ");
                int userQ = scanner.nextInt();
                while(userQ != 1 && userQ != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to call register menu or press 0 to exit: ");
                    userQ = scanner.nextInt();
                }
                if(userQ == 1){
                    callRegister();
                }
                else{
                    break;
                }
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
                System.out.println("Press 1 to go back to  tone menu or press 0 to exit: ");
                int userQ = scanner.nextInt();
                while(userQ != 1 && userQ != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to  tone  menu or press 0 to exit: ");
                    userQ = scanner.nextInt();
                }
                if(userQ == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 2:
                System.out.println("Ringing Volume");
                System.out.println("Press 1 to go back to tone menu or press 0 to exit: ");
                int userS = scanner.nextInt();
                while(userS != 1 && userS != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to tone menu or press 0 to exit: ");
                    userS = scanner.nextInt();
                }
                if(userS == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 3:
                System.out.println("Incoming Call Alert");
                System.out.println("Press 1 to go back to tone menu or press 0 to exit: ");
                int userR = scanner.nextInt();
                while(userR != 1 && userR != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to tone menu or press 0 to exit: ");
                    userR = scanner.nextInt();
                }
                if(userR == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 4:
                System.out.println("Composer");
                System.out.println("Press 1 to go back to tone menu or press 0 to exit: ");
                int userJ = scanner.nextInt();
                while(userJ != 1 && userJ != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to tone menu or press 0 to exit: ");
                    userJ = scanner.nextInt();
                }
                if(userJ == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 5:
                System.out.println("Message Alert Tone");
                System.out.println("Press 1 to go back to tone menu or press 0 to exit: ");
                int userD = scanner.nextInt();
                while(userD != 1 && userD != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to tone menu or press 0 to exit: ");
                    userD = scanner.nextInt();
                }
                if(userD == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 6:
                System.out.println("Keypad Tones");
                System.out.println("Press 1 to go back to  tones menu or press 0 to exit: ");
                int userV = scanner.nextInt();
                while(userV != 1 && userV != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to tones menu or press 0 to exit: ");
                    userV = scanner.nextInt();
                }
                if(userV == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 7:
                System.out.println(" Warning and Game Tones");
                System.out.println("Press 1 to go back to tones menu or press 0 to exit: ");
                int userF = scanner.nextInt();
                while(userF != 1 && userF != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to tones menu or press 0 to exit: ");
                    userF = scanner.nextInt();
                }
                if(userF == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 8:
                System.out.println("Vibrating Alert");
                System.out.println("Press 1 to go back to tones menu or press 0 to exit: ");
                int userY = scanner.nextInt();
                while(userY != 1 && userY != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back tone menu or press 0 to exit: ");
                    userY = scanner.nextInt();
                }
                if(userY == 1){
                    tones();
                }
                else{
                    break;
                }
                break;

            case 9:
                System.out.println("Screen Saver");
                System.out.println("Press 1 to go back to tones menu or press 0 to exit: ");
                int userP = scanner.nextInt();
                while(userP != 1 && userP != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to tones menu or press 0 to exit: ");
                    userP = scanner.nextInt();
                }
                if(userP == 1){
                    tones();
                }
                else{
                    break;
                }
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
                System.out.println("Press 1 to go back to call divert menu or press 0 to exit: ");
                int userQ = scanner.nextInt();
                while(userQ != 1 && userQ != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to call divert menu or press 0 to exit: ");
                    userQ = scanner.nextInt();
                }
                if(userQ == 1){
                    callDivert();
                }
                else{
                    break;
                }
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
                        System.out.println(" will you like to continue, if yes press 1 , if press 0 to go back or press (-1) to exit:");
                        int number5 = guess.nextInt();
                        while(number5 == 1){
                            guessGame();
                            System.out.println(" will you like to continue, if yes press 1 , if press 0 to go back or press (-1) to exit:");
                             number5 = guess.nextInt();
                        }
                        if (number5 == 0){
                            games();

                        } else if (number5 == -1) {
                            break;

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
                System.out.println("Press 1 to go back to reminder menu or press 0 to exit: ");
                int userQ = scanner.nextInt();
                while(userQ != 1 && userQ != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to reminder menu or press 0 to exit: ");
                    userQ = scanner.nextInt();
                }
                if(userQ == 1){
                    reminders();
                }
                else{
                    break;
                }
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
                System.out.println("Press 1 to go back to profiles menu or press 0 to exit: ");
                int userQ = scanner.nextInt();
                while(userQ != 1 && userQ != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to profiles menu or press 0 to exit: ");
                    userQ = scanner.nextInt();
                }
                if(userQ == 1){
                    profiles();
                }
                else{
                    break;
                }
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
                System.out.println("Press 1 to go back to sim service menu or press 0 to exit: ");
                int userQ = scanner.nextInt();
                while(userQ != 1 && userQ != 0){
                    System.out.println("Kindly Enter a correct number...Press 1 to go back to sim service menu or press 0 to exit: ");
                    userQ = scanner.nextInt();
                }
                if(userQ == 1){
                    simServices();
                }
                else{
                    break;
                }
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
