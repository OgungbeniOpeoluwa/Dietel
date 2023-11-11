package chapter7.DeckGame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardTest {
    @Test
    public void testIsNotAFlush() {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList<String> myDeckSuites = new ArrayList<>();
        myDeckSuites.add( "spades");
        myDeckSuites.add("club");
        myDeckSuites.add("diamond");
        myDeckSuites.add("diamond");
        myDeckSuites.add("club");
         assertFalse(deckOfCard.isAflush(myDeckSuites));

    }
    @Test
    public void testIsAFlush() {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList<String> myDeckSuites = new ArrayList<>();
        myDeckSuites.add( "club");
        myDeckSuites.add("club");
        myDeckSuites.add("club");
        myDeckSuites.add("club");
        myDeckSuites.add("club");
        assertTrue(deckOfCard.isAflush(myDeckSuites));
    }
    @Test
    public void testHandISFourOfAKind() {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList<String> myDeckSuites = new ArrayList<>();
        myDeckSuites.add( "Ace");
        myDeckSuites.add("Deuce");
        myDeckSuites.add("Ace");
        myDeckSuites.add("Ace");
        myDeckSuites.add("Ace");
        assertTrue(deckOfCard.fourOfAKind(myDeckSuites));

    }
    @Test
    public void testHandISNotFourOfAKind() {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList<String> myDeckSuites = new ArrayList<>();
        myDeckSuites.add( "Queen");
        myDeckSuites.add("Ace");
        myDeckSuites.add("Jack");
        myDeckSuites.add("Queen");
        myDeckSuites.add("Queen");
        assertFalse(deckOfCard.fourOfAKind(myDeckSuites));

    }
    @Test
    public void testHandISNotThreeOfAKind() {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList<String> myDeckSuites = new ArrayList<>();
        myDeckSuites.add( "Queen");
        myDeckSuites.add("Ace");
        myDeckSuites.add("Jack");
        myDeckSuites.add("Queen");
        myDeckSuites.add("Queen");
        assertTrue(deckOfCard.threeOfAKind(myDeckSuites));

    }
    @Test
    public void testHandHasTwoPairs() {
        DeckOfCard deckOfCard = new DeckOfCard();
        ArrayList<String> myDeckSuites = new ArrayList<>();
        myDeckSuites.add( "Queen");
        myDeckSuites.add("Queen");
        myDeckSuites.add("Jack");
        myDeckSuites.add("Ace");
        myDeckSuites.add("Jack");
        assertTrue(deckOfCard.twoPairs(myDeckSuites));

    }



}