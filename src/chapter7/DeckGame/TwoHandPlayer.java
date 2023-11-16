package chapter7.DeckGame;

import java.util.ArrayList;

public class TwoHandPlayer {
    public static void main(String[] args) {
        Players[] players = {new Players(), new Players()};
        ArrayList <Card> player1 = new ArrayList<>();
        ArrayList <Card> player2 = new ArrayList<>();
        players[0].play();
        players[1].play();
        for(int count = 1;count <=52; count++) {
            Card result = players[0].deckOfCard.dealCard();
            Card results = players[1].deckOfCard.dealCard();
            player1.add(result);
            player2.add(results);


            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }


}
