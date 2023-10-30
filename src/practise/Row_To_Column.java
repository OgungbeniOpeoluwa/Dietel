package practise;

public class Row_To_Column {
    public static double[][] reverseRowToColumn(double[][] array) {
        double [][] arrays = new double[array[0].length][array.length];
        int counters = 0;
          for(int count = 0; count < arrays.length; count++) {
              for (int counter = array.length-1; counter >= 0; counter--) {
                  arrays[count][counters] = array[counter][count];
                  counters++;
              }

              counters = 0;
          }
        return arrays;
    }


    public static void loop(double [][] array){
        for(int count = 0; count < array.length; count++) {
            for (int counter = 0; counter < array.length; counter++) {
                System.out.print(array[count][counter] + "   ");
            }
            System.out.println();
        }
    }
}
