package practise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MbitPersonality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        String[] result = question1();
        String[] result1 = question2();
        String[] result2 = question3();
        String[] result3 = question4();
        String[][] array = {result, result1, result2, result3};
        int number = 0;
        int number2 = 0;

        System.out.println("Hello  " + name + " You selected: ");
        for (int count = 0; count < array.length; count++) {
            for (int counts = 0; counts < array[count].length; counts++) {
                String results = array[count][counts];
                if (results.startsWith("A.")) {
                    number++;
                } else if (results.startsWith("B.")) {
                    number2++;
                }
                System.out.println(results);
            }
            System.out.println("Number of A :" + number);
            System.out.println("Number of B :" + number2);
            number -= number;
            number2 -= number2;
            System.out.println();


        }
    }

    public static String[] question1() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. expend energy,enjoy groups      B.conserves energy ,enjoy-one on - one");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. expend energy,enjoy groups      B.conserves energy ,enjoy-one on - one");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. expend energy,enjoy groups ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. conserves energy ,enjoy-one on - one";

                    }
                }
                case 1 -> {
                    System.out.println("A. more outgoing,think out loud      B.more reserved,think to yourself");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. more outgoing,think out loud      B.more reserved,think to yourself");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. more outgoing,think out loud";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. more reserved,think to yourself";

                    }
                }
                case 2 -> {
                    System.out.println("A. seek many task , public activities , interaction with others     B. seek private, solitary activities with quiet to concentrate");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. seek many task , public activities , interaction with others     B. seek private, solitary activities with quiet to concentrate");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A.  seek many task , public activities , interaction with others";

                    } else if (input.equals("B")) {
                        array[count] = "B.  seek private, solitary activities with quiet to concentrate";
                    }
                }
                case 3 -> {
                    System.out.println("A. external,communicative,express yourself      B. internal,reticent,keep to yourself");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. external,communicative,express yourself      B. internal,reticent,keep to yourself");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. external,communicative,express yourself ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B.  internal,reticent,keep to yourself";

                    }
                }
                case 4 -> {
                    System.out.println("A. active, initiate      B. reflective, deliberate");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. active, initiate      B. reflective, deliberate");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A. active, initiate";

                    } else if (input.equals("B")) {
                        array[count] = "B. reflective, deliberate";

                    }
                }
            }
        }

        return array;
    }

    public static String[] question2() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. Interpret literally      B.look for meaning and possibilities");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. Interpret literally      B.look for meaning and possibilities");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A. Interpret literally";

                    } else if (input.equals("B")) {
                        array[count] = "B. look for meaning and possibilities";
                    }
                }
                case 1 -> {
                    System.out.println("A. Practical, realistic, experimental      B.imaginative,innovative,theoretical");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. Practical, realistic, experimental      B.imaginative,innovative,theoretical");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. Practical, realistic, experimental";

                    } else if (inputs.equals("B")) {
                        array[count] = "B.  imaginative,innovative,theoretical";

                    }
                }
                case 2 -> {
                    System.out.println("A. standard,usual,conventional      B. different,novel,unique");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. standard,usual,conventional      B. different,novel,unique");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  standard,usual,conventional";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. different,novel,unique";

                    }
                }
                case 3 -> {
                    System.out.println("A. focus on here-and-now     B. look to the future,global perspective,big picture");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. focus on here-and-now     B. look to the future,global perspective,big picture");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. focus on here-and-now";

                    } else if (inputs.equals("B")) {
                        array[count] = "B.  look to the future,global perspective,big picture";

                    }
                }
                case 4 -> {
                    System.out.println("A. facts, things,what is      B.idea,dreams,what could be,philosophical");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. facts, things,what is      B.idea,dreams,what could be,philosophical");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. facts, things,what is";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. idea,dreams,what could be,philosophical";
                    }
                }
            }
        }

        return array;
    }

    public static String[] question3() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. logical,thinking,questioning      B.empathetic, feeling,accommodating");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. logical,thinking,questioning      B.empathetic, feeling,accommodating");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  logical,thinking,questioning ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. empathetic, feeling,accommodating";

                    }
                }
                case 1 -> {
                    System.out.println("A. candid, straight-forward,frank      B.tactful,kind,encouraging");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. candid, straight-forward,frank      B.tactful,kind,encouraging");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. candid, straight-forward,frank ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. tactful,kind,encouraging";

                    }
                }
                case 2 -> {
                    System.out.println("A. firm,tend to criticize,,hold the line      B. gentle,tend to appreciate");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. firm,tend to criticize,,hold the line      B. gentle,tend to appreciate");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. firm,tend to criticize,,hold the line ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. gentle,tend to appreciate";
                    }
                }
                case 3 -> {
                    System.out.println("A. tough-minded,just      B.tender-hearted,merciful");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. tough-minded,just      B.tender-hearted,merciful");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. tough-minded,just";
                    } else if (inputs.equals("B")) {
                        array[count] = "B. .tender-hearted,merciful";
                    }
                }
                case 4 -> {
                    System.out.println("A. matter of fact,issue-oriented      B.sensitive ,people-oriented,compassionate");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. matter of fact,issue-oriented      B.sensitive ,people-oriented,compassionate");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  matter of fact,issue-oriented";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. .sensitive ,people-oriented,compassionate";

                    }
                }
            }


        }

        return array;
    }

    public static String[] question4() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int count = 0; count < 5; count++) {
            switch (count) {
                case 0 -> {
                    System.out.println("A. organized,orderly      B.flexible,adaptable");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. organized,orderly      B.flexible,adaptable");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. organized,orderly";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. flexible,adaptable";
                    }
                }
                case 1 -> {
                    System.out.println("A. plan schedule     B. unplanned,spontaneous");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. plan schedule     B. unplanned,spontaneous");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. plan schedule  ";
                    } else if (inputs.equals("B")) {
                        array[count] = "B. unplanned,spontaneous";
                    }
                }
                case 2 -> {
                    System.out.println("A. regulated structured      B.easy going,live and let live");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. regulated structured      B.easy going,live and let live");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A. regulated structured";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. easy going,live and let live ";

                    }
                }
                case 3 -> {
                    System.out.println("A. preparation, plan ahead     B. go with the flow,adapt as you go");
                    String inputs = scanner.next().toUpperCase();
                    while (!(inputs.matches("A") || inputs.matches("B"))) {
                        System.out.println("A. preparation, plan ahead     B. go with the flow,adapt as you go");
                        inputs = scanner.next().toUpperCase();
                    }
                    if (inputs.equals("A")) {
                        array[count] = "A.  preparation, plan ahead ";

                    } else if (inputs.equals("B")) {
                        array[count] = "B. go with the flow,adapt as you go";

                    }
                }
                case 4 -> {
                    System.out.println("A. Control, govern      B.latitude, freedom");
                    String input = scanner.next().toUpperCase();
                    while (!(input.matches("A") || input.matches("B"))) {
                        System.out.println("A. Control, govern      B.latitude, freedom");
                        input = scanner.next().toUpperCase();
                    }
                    if (input.equals("A")) {
                        array[count] = "A. control,govern";
                    } else if (input.equals("B")) {
                        array[count] = "B. latitude,freedom";
                    }
                }
            }

        }

        return array;
    }
}



