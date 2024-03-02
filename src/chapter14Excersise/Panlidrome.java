package chapter14Excersise;

import java.util.function.BiPredicate;

public class Panlidrome {
    private static BiPredicate<String,String> value;

    public static boolean pandlindrome(String inputs){
        BiPredicate<String,String> value = (word,input)-> new StringBuilder(word).reverse().toString().equalsIgnoreCase(input);
        return value.test(inputs,inputs);


    }



}
