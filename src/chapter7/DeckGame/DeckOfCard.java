package chapter7.DeckGame;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DeckOfCard {

   private static SecureRandom random = new SecureRandom();
    private static final int NUMBER_OF_CARD = 52;
    private Card [] deck = new Card[NUMBER_OF_CARD];
    private int currentCard = 0;
    String [] faces;

    public DeckOfCard(){
        faces = new String[] {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new  Card(faces[count % 13], suits[count / 13]);
        }
    }
    public String [] getFaces(){
        return  faces;
    }
    public void shuffle(){
        currentCard = 0;
        for(int first = 0; first < deck.length; first++){
            int second = random.nextInt(NUMBER_OF_CARD);
            Card temp = deck[first];
            deck[first]  = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else{
            return  null;
        }
    }
    public boolean  isPair( ArrayList <String> cardList){
        boolean result = false;
           for(int count = 0; count < cardList.size();count++){
               for(int counter = count+1; counter < cardList.size();counter++){
                   if(cardList.get(count).equals(cardList.get(counter))) {
                       result = true;
                       break;
                   }
               }
           }
           return result;
    }

    public boolean  threeOfAKind( ArrayList <String> cardList){
        int counters = 0;
        boolean result = false;
        for(int count = 0; count < cardList.size();count++){
            for(int counter = count; counter < cardList.size();counter++){
                if(cardList.get(count).equals(cardList.get(counter))){
                    counters ++;
                }
            }
            if(counters == 3) {
                result = true;
                break;}
            counters = 0;
        }
        return result;
    }
    public boolean  fourOfAKind( ArrayList <String> cardList){
        int counters = 0;
        boolean result = false;
        for(int count = 0; count < cardList.size();count++){
            for(int counter = count; counter < cardList.size();counter++){
                if(cardList.get(count).equals(cardList.get(counter))){
                    counters ++;
                }
            }
            if(counters == 4) {
                result = true;
                break;}
            counters = 0;
        }
        return result;
    }
    public boolean  isAflush( ArrayList <String> cardList){
        boolean result = true;
        for(int count = 0; count < cardList.size();count++){
            for(int counter = count+1; counter < cardList.size();counter++) {
                if (!(cardList.get(count).equals(cardList.get(counter)))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean twoPairs(ArrayList<String> myDeckSuites) {
        boolean answer = false;
        int counter = 0;
        int result = 0;
        for(int count = 0; count< myDeckSuites.size();count++){
            for(int counts = count; counts < myDeckSuites.size();counts++){
                if(myDeckSuites.get(count).equals(myDeckSuites.get(counts))){
                    counter++;
                }
            }
            if(counter == 2){
                result++;
            }
            if(counter > 2){
                answer = false;
                break;
            }
            counter = 0;
        }
        if(result == 2){
            answer = true;
        }
        return answer;
    }

    public boolean isAStraight(ArrayList<String> myDeckSuites) {
        HashMap<String, Integer> result = getStringIntegerHashMap();
        int [] results =  sortFaceValue(sortFaceValueToNumbers(myDeckSuites, result));
        int counter = results[0];
        boolean answer = true;
       for(int count = 1; count < results.length; count++){
            counter +=1;
            if(results[count] != counter){
                answer = false;
           }
        }
        return answer;
    }

    private static int [] sortFaceValueToNumbers(ArrayList<String> myDeckSuites, HashMap<String, Integer> result) {
        int [] arrays = new int[myDeckSuites.size()];
        for(int count = 0; count < myDeckSuites.size(); count++ ){
            arrays[count] = result.get(myDeckSuites.get(count));
        }
        return arrays;
    }

    private HashMap<String, Integer> getStringIntegerHashMap() {
        HashMap <String, Integer> result = new HashMap<>();
        for(int count = 0;count < 13;count++){
            result.put(getFaces()[count], (count+1) );

        }
        return result;
    }

    public boolean isAFullHouse(ArrayList<String> myDeckSuites) {
        boolean answer = isPair(myDeckSuites);
        boolean answers = threeOfAKind(myDeckSuites);
        boolean result = false;
        if(answer && answers){
            result = true;
        }
        return result;

    }
    private int [] sortFaceValue(int [] faceValues){
        for(int count = 0; count < faceValues.length;count++){
            for(int counts = 0; counts< faceValues.length; counts++){
                if(faceValues[count] == faceValues[counts]){
                    int temp = faceValues[count];
                    faceValues[count] = faceValues[counts];
                    faceValues[counts] = temp;
                }
            }
        }
        return faceValues;
    }


}
