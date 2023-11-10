package chapter7.DeckGame;

public class Card {
    private String face;
    private String suite;
    public Card(String face, String suite){
        this.face = face;
        this.suite = suite;
    }
    public String toString(){
        return face + " of " + suite;
    }
    public String getFace(){
        return face;
    }
    public String getSuites(){
        return suite;
    }
}
