package chapter7;

import java.security.SecureRandom;

public class TortiseAndTheHare {

    private int tortisePosition =1;
    private int harePosition =1;
    private String [] tortise = new  String[70];
    private  String [] hare = new  String[70];

    public TortiseAndTheHare(){
        for(int count = 0; count < 70; count++){
            tortise[count] = "";
            hare  [count] = "";
        }
        tortise[getTortisePosition()-1] ="H" ;
        hare[getHarePosition()-1]= "T";
    }

    public int getTortisePosition() {
        if(tortisePosition < 1){
            tortisePosition = 1;
        }
        return tortisePosition;
    }
    public void tortiseMove(int number){
        if(number >=1 && number <= 5)tortisePosition += 3;
        if(number  >= 6 && number <=7) tortisePosition -= 6;
        if(number >= 8 && number <= 10) tortisePosition += 1;
    }
    public int getHarePosition(){
        if(harePosition < 1){
            harePosition = 1;
        }return harePosition;
    }

    public int play() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(1,11);
    }

    public void hareMove(int number) {
        if(number >=1 && number <= 2)harePosition += 9;
        if(number  >= 3 && number <=5) harePosition += 1;
        if(number >= 6 && number <= 7) harePosition-= 12;
        if(number >=8 && number <= 9)harePosition -= 2;
        if(number == 10) harePosition = harePosition ;
    }

}
