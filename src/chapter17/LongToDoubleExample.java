package chapter17;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleExample {
    public static void main(String[] args) {
        LongToDoubleFunction  value = (number) -> number + 3;
        System.out.println(value.applyAsDouble(125));
    }
}
