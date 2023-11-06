package practise;

import java.util.ArrayList;

public class calculator2 {
    private ArrayList <String> result = new ArrayList<>();
    int counter = 0;


    public void  boardMas(String number) {
        int start = 0;
        if(number.charAt(0) == '-'){
           result = checker(number);
            start = counter;
            for (int count = counter ; count < number.length(); count++) {
                if (!(number.charAt(count) + "").matches("\\d+")) {
                    result.add(number.substring(start, count));
                    result.add(String.valueOf(number.charAt(count)));
                    start = count + 1;
                }
            }

        }
        else{
            for (int count = 0; count < number.length(); count++) {
               if(!(number.charAt(count) + "").matches("\\d+")){
                    result.add(number.substring(start,count));
                    result.add(String.valueOf(number.charAt(count)));
                    start = count +1;

                }
            }

        }
        result.add(String.valueOf(number.charAt(number.length()-1)));
        System.out.println(result);

    }

    public void calculator(String number){
        boardMas(number);
        for(String numb : result){
            if(numb.equals("/")){
                int count = result.indexOf(numb);
                 division(count);
            }
        }

          for(String numb : result){
            if(numb.equals("*")) {
                int count = result.indexOf(numb);
                multiplication(count);

            }
        }

          for(String numb : result) {
            if (numb.equals("+")) {
                System.out.println(result);
                int count = result.indexOf(numb);
                addition(count);
            }
        }


        for(String numb : result){
            if(numb.equals("-")){
                int count = result.indexOf(numb);
                subtraction(count);

            }
        }
    }

    public void division(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = Integer.parseInt(result.get(numb-1));
        int counter = Integer.parseInt(result.get(numb + 1));
        int total = counts / counter;
        for(int count = 0; count < result.size();count++){
            if(count == numb -1){
                number.add(String.valueOf(total));
                count +=2;
            }
            else {
                String res = result.get(count);
                number.add(res);
            }

        }
        result = number;

    }
    public void subtraction(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = Integer.parseInt(result.get(numb-1));
        int counter = Integer.parseInt(result.get(numb + 1));
        int total = counts - counter;
        for(int count = 0; count < result.size();count++){
            if(count == numb -1){
                number.add(String.valueOf(total));
                count +=2;
            }
            else {
                String res = result.get(count);
                number.add(res);
            }
        }
        result = number;

    }
    public void multiplication(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = Integer.parseInt(result.get(numb-1));
        System.out.println(counts);
        int counter = Integer.parseInt(result.get(numb + 1));
        System.out.println(counter);
        int total = counts * counter;
        for(int count = 0; count < result.size();count++){
            if(count == numb-1){
                number.add(String.valueOf(total));
                count +=2;
            }
            else {
                String res = result.get(count);
                number.add(res);
            }

        }
        System.out.println(result);
        result = number;

    }
    public void addition(int numb){
        ArrayList <String> number = new ArrayList<>();
        int counts = Integer.parseInt(result.get(numb-1));
        int counter = Integer.parseInt(result.get(numb + 1));
        int total = counts + counter;
        for(int count = 0; count < result.size();count++){
            if(count == numb -1){
                number.add(String.valueOf(total));
                count +=2;
            }else {
                String res = result.get(count);
                number.add(res);
            }
        }
        result = number;

    }
    private  ArrayList<String> checker (String numbers) {
        String results = "";
        int start = 1;
        for (int count = 1; count < numbers.length(); count++) {
            if (!(numbers.charAt(count) + "").matches("\\d+")) {
                if (numbers.charAt(0) == '-') {
                    results += numbers.charAt(0);
                    result.add(results + numbers.substring(start, count));
                    result.add(String.valueOf(numbers.charAt(count)));
                    counter = count + 1;
                    break;
                }
            }
        }
        return result;
    }
        public int getResult(){
            return Integer.parseInt(result.get(0));
        }
}


