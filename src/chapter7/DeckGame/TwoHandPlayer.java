package chapter7.DeckGame;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoHandPlayer {
    public static void main(String[] args) {
        Players[] players = {new Players(), new Players()};
        HashMap <String,String> player1 = new HashMap<>();
        HashMap <String,String> player2 = new HashMap<>();
        players[0].play();
        players[1].play();
        for(int count = 1;count <=52; count++) {
            Card result = players[0].deckOfCard.dealCard();
            Card results = players[1].deckOfCard.dealCard();
            player1.put(result.getFace(), result.getSuites());
            player2.put(results.getFace(), results.getSuites());


            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }


}
