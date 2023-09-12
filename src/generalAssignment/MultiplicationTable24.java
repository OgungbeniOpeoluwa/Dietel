 package generalAssignment;

 public class MultiplicationTable24 {
    public static void main(String[] args) {
        int count;
        int counter;
        int number;
       // int total = 0;
        for (count = 1; count <= 24; count++) {
            //System.out.print(" ");
            for (counter = 1; counter <= 24; counter++) {
                number = count * counter;
                    System.out.print(count  +"*" + counter +"=" + number + " \t\t");

                }
            System.out.println(" ");
        }



    }
}
