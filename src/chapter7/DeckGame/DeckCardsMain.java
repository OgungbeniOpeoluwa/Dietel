package chapter7.DeckGame;

import java.util.ArrayList;

public class DeckCardsMain {
    public static void main(String[] args) {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList <String> myDeckCard = new ArrayList<>();
        ArrayList<String> myDeckSuites = new ArrayList<>();
        deckOfCard.shuffle();
        for(int count = 1;count <=52; count++){
            Card result = deckOfCard.dealCard();
            System.out.printf("%-19s",result);
            myDeckCard.add(result.getFace());
            myDeckSuites.add(result.getSuites());


            if(count % 5 ==0){
                System.out.println(myDeckSuites);
                System.out.println();
                if(deckOfCard.isPair(myDeckCard))System.out.println(" is a pair");
                System.out.println();
                if(deckOfCard.threeOfAKind(myDeckCard))System.out.println(" has three of a kind ");
                System.out.println();
                if(deckOfCard.fourOfAKind(myDeckCard))System.out.println(" has four of a kind ");
                System.out.println();
                if(deckOfCard.isAflush(myDeckSuites))System.out.println(" has five same suites");
                myDeckSuites.clear();
                myDeckCard.clear();


            }

            }
    }
}
