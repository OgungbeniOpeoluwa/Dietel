package chapter7.DeckGame;

import java.util.ArrayList;

public class DeckCardsMain {
    public static void main(String[] args) {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList <String> myDeckCard = new ArrayList<>();
        deckOfCard.shuffle();
        for(int count = 1;count <=52; count++){
            Card result = deckOfCard.dealCard();
            System.out.printf("%-19s",result);
            myDeckCard.add(result.getFace());


            if(count % 5 ==0){
                System.out.println();
                System.out.print(myDeckCard.add(result.getSuites()));
                if(deckOfCard.isPair(myDeckCard))System.out.println(" is a pair");
                System.out.println();
                if(deckOfCard.threeAndFourOfAKind(myDeckCard))System.out.println(" has three of a kind ");
                myDeckCard.clear();


            }

            }
    }
}
