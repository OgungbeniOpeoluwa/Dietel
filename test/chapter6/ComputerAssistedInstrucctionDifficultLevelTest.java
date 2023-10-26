package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerAssistedInstrucctionDifficultLevelTest {
    @Test
    public void testDifficultLevel1(){
        int numb = 30;
        assertEquals(numb,ComputerAssistedInstrucctionDifficultLevel.dificultLevel1(6,5));
    }
    @Test
    public void testDifficultLevel2(){
        int numb = 375;
        assertEquals(numb,ComputerAssistedInstrucctionDifficultLevel.difficultLevel2(15,25));

    }

}