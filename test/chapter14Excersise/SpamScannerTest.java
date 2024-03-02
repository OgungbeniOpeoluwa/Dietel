package chapter14Excersise;

import org.junit.jupiter.api.Test;

class SpamScannerTest {
    @Test
    public void testThatMessageIsASpamMeessage(){
        String emailMessage = """
                Life is meant for experiences, not spending hours creating study materials.
                Our quiz feature streamlines your study experience, allowing you to create 
                customized quizzes quickly.
                Here's how easy it is to use:
                1. Select your course
                2. Choose the number of questions you want and the difficulty
                3. Enjoy saving time without sacrificing study efforts.
                And as always, if you need step-by-step video solutions, 
                Numerade’s Day Pass feature is available for only $3.
                Try Day Pass
                """;

    }

}