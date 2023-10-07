package Assignment;

import java.util.Arrays;

public class ExtractColoumn {
    public static void main(String[] args) {
    int [][] data = {{2,4,5,2},{3,6,7,3},{1,8,9,5} };
    int [] numb = new int[data.length];
    int [] result = MultiDimensionalArray.extractColoumns(data,2,3);
        System.out.println(Arrays.toString(result));

    }

}
