package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTourMainTest {
    KnightTourMain knightTour;
    @BeforeEach
            public void setKnightTour() {
         knightTour = new KnightTourMain();
    }
    @Test
    public void testCurrentPositionOfKnightOnBoard(){
        int [] array = {3,4};
        assertArrayEquals(array,knightTour.getPosition());
    }
    @Test
    public void testPositionMoved(){
        int movement = 0;
        knightTour.moveKnight(movement);
        int [] array = {2,6};
        assertArrayEquals(array,knightTour.getPosition());


    }
    @Test
    public void testAnotherMovedPosition(){
        int movement = 6;
        knightTour.moveKnight(movement);
        int [] array = {5,5};
        assertArrayEquals(array,knightTour.getPosition());
        knightTour.moveKnight(3);
        int [] move = {4,3};
        assertArrayEquals(move,knightTour.getPosition());


    }
    @Test
    public void testThatTheKnightHasVisitedTheSquare(){
        int movement = 3;
        knightTour.moveKnight(movement);
        int [] array = {2,3};
        assertArrayEquals(array,knightTour.getPosition());
        knightTour.moveKnight(7);
        int [] move = {2,3};
        assertArrayEquals(move,knightTour.getPosition());
    }

}