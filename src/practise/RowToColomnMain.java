package practise;

import static practise.Row_To_Column.loop;

public class RowToColomnMain {
    public static void main(String[] args) {
        double [][] array = {{55.5,45.6,70.9},{28.6,45.9,60.9},{34.5,68.78,23.4}};
        double [][] arrays =Row_To_Column.reverseRowToColumn(array);
        loop(array);
        System.out.println();
        loop(arrays);
    }

}
