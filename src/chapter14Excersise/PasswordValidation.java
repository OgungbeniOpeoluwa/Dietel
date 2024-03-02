package chapter14Excersise;

import java.util.function.Predicate;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(passwordValidator("opeE1234"));
    }
    private static Predicate<String> passwords;

    public static boolean passwordValidator(String password) {
        passwords = (value) -> value.matches("^[a-z]+[A-Z]+\\d+\\w{8,15}$");
        return passwords.test(password);
    }
}
