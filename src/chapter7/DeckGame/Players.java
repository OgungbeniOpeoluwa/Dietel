package chapter7.DeckGame;

import java.util.ArrayList;

public class Players {
    private  String name;
    DeckOfCard deckOfCard = new DeckOfCard();
    public  void setName(String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }
    public void play(){
        deckOfCard.shuffle();
    }
  //  public boolean game(ArrayList <Card> result){
//        ArrayList <String> faces = new ArrayList<>();
//        ArrayList <String> suites = new ArrayList<>();
//        for(int count = 0; count < result.size(); count++){
//            Card results = result.get(count);
//            faces.add(results.getFace());
//            suites.add(results.getSuites());
//        }
//
//        deckOfCard.isPair();
//        deckOfCard.twoPairs();
//        deckOfCard.threeOfAKind();
//    }
}
