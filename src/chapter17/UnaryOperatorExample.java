package chapter17;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> unary = (word)->new StringBuilder(word).reverse().toString();
        System.out.println(unary.apply("SHola kosoko"));

        BinaryOperator<String> value = (word,number) -> word +" "+ "is an object of "+ "" + number;

        System.out.println(value.apply("delighted","past tense"));
    }
}
