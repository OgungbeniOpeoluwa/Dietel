package liangExcersise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPasswordTest {
    @Test
    public void testPasswordIsValid(){
        String password = "opemip12i";
        assertTrue(CheckPassword.passwordValidity(password));
    }

}