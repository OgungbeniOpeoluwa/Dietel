package liangExcersise.fan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Speed {
    SLOW(1), MEDIUM(2), FAST(3), ABC(3);

    private final int value;

    Speed(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        int [] array = new int[5];
        ArrayList<int[]> list2 = new ArrayList<>();
        array[0]= 10;
        array[1]= 56;
        array[2]= 178;
        array[3]= 19;
        list2.add(array);
        array[4] = 55;
        list2.add(array);
        System.out.println(Arrays.toString(list2.get(0)));
        System.out.println(Arrays.toString(list2.get(1)));


    }
}
