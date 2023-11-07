package practise;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Calculator2 {
    private ArrayList <String> finalResult = new ArrayList<>();
    int counter = 0;


    public void  boardMas(String number) {
        String results = "";
        StringTokenizer result = new StringTokenizer(number, " ");
        while(result.hasMoreTokens()){
                results += result.nextToken();

        }
          int start = 0;
        if(results.charAt(0) == '-'){
           finalResult= checker(results);
            start = counter;
            for (int count = counter ; count < results.length(); count++) {
                if (!(results.charAt(count) + "").matches("\\d+")) {
                    finalResult.add(results.substring(start, count));
                    finalResult.add(String.valueOf(results.charAt(count)));
                    start = count + 1;
                }
            }

        }
        else {
             for (int count = 0; count < results.length(); count++) {
                 if (!(results.charAt(count) + "").matches("\\d+")) {
                     finalResult.add(results.substring(start, count));
                     finalResult.add(String.valueOf(results.charAt(count)));
                     start = count + 1;

                 }
             }

        }
        finalResult.add(results.substring(start));

    }

    public void calculator(String number){
        boardMas(number);
        for(String numb : finalResult){
            if(numb.equals("/")){
                int count = finalResult.indexOf(numb);
                 division(count);
            }
        }

          for(String numb : finalResult){
            if(numb.equals("*")) {
                int count = finalResult.indexOf(numb);
                multiplication(count);

            }
        }

          for(String numb : finalResult) {
            if (numb.equals("+")) {
                int count = finalResult.indexOf(numb);
                addition(count);
            }
        }


        for(String numb : finalResult){
            if(numb.equals("-")){
                int count = finalResult.indexOf(numb);
                subtraction(count);

            }
        }
    }

    public void division(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = getParseInt(numb);
        int counter = getCounter(numb);
        int total = counts / counter;
        for(int count = 0; count < finalResult.size(); count++){
            if(count == numb -1){
                number.add(String.valueOf(total));
                count +=2;
            }
            else {
                String res = finalResult.get(count);
                number.add(res);
            }

        }
        finalResult = number;

    }
    public void subtraction(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = getParseInt(numb);
        int counter = getCounter(numb);
        int total = counts - counter;
        for(int count = 0; count < finalResult.size(); count++){
            if(count == numb -1){
                number.add(String.valueOf(total));
                count +=2;
            }
            else {
                String res = finalResult.get(count);
                number.add(res);
            }
        }
        finalResult = number;

    }
    public void multiplication(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = getParseInt(numb);
        int counter = getCounter(numb);
        int total = counts * counter;
        for(int count = 0; count < finalResult.size(); count++){
            if(count == numb-1){
                number.add(String.valueOf(total));
                count +=2;
            }
            else {
                String res = finalResult.get(count);
                number.add(res);
            }

        }
        finalResult = number;

    }
    public void addition(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = getParseInt(numb);
        int counter = getCounter(numb);
        int total = counts + counter;
        for(int count = 0; count < finalResult.size(); count++){
            if(count == numb -1){
                number.add(String.valueOf(total));
                count +=2;
            }else {
                String res = finalResult.get(count);
                number.add(res);
            }
        }
        finalResult = number;

    }

    private int getCounter(int numb) {
        return Integer.parseInt(finalResult.get(numb + 1));
    }

    private int getParseInt(int numb) {
        return Integer.parseInt(finalResult.get(numb - 1));
    }

    private  ArrayList<String> checker (String numbers) {
        String results = "";
        int start = 1;
        for (int count = 1; count < numbers.length(); count++) {
            if (!(numbers.charAt(count) + "").matches("\\d+")) {
                if (numbers.charAt(0) == '-') {
                    results += numbers.charAt(0);
                    finalResult.add(results + numbers.substring(start, count));
                    finalResult.add(String.valueOf(numbers.charAt(count)));
                    counter = count + 1;
                    break;
                }
            }
        }
        return finalResult;
    }
        public int getFinalResult(){
            return Integer.parseInt(finalResult.get(0));
        }
}


