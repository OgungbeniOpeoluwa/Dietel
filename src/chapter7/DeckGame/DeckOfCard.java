package chapter7.DeckGame;

import java.security.SecureRandom;
import java.util.ArrayList;

public class DeckOfCard {

   private static SecureRandom random = new SecureRandom();
    private static final int NUMBER_OF_CARD = 52;
    private Card [] deck = new Card[NUMBER_OF_CARD];
    private int currentCard = 0;
    public DeckOfCard(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new  Card(faces[count % 13], suits[count / 13]);
        }
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
                if(!(cardList.get(count).equals(cardList.get(counter)))) {
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
        return false;
    }
}
