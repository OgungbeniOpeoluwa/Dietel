package chapter14Excersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordValidationTest {
    @Test
    public void validateThatPasswordMeetThePasswordCriteriaTest(){
        String password = "sholaH3ewr";
        assertTrue(PasswordValidation.passwordValidator(password));

    }
    @Test
    public void testThat_HelloGirl_isInvalid(){
        String word = "HelloGirl";
        assertFalse(PasswordValidation.passwordValidator(word));
    }

}