package generalAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the of rows expected:");
        int input = scanner.nextInt();
        System.out.println("Enter the length of your coloumn: ");
        int inputs = scanner.nextInt();
        int [][] inputer =new int[input][inputs];
        for(int number=0;number < inputer.length; number++){
            for(int numbers =0; numbers < inputer.length;numbers++){
                System.out.println("Enter number :");
                int enter = scanner.nextInt();
                inputer[number][numbers] = enter;
            }
        }
        System.out.println("enter your row to take input from:");
        int row = scanner.nextInt();
        System.out.println("enter your start:");
        int start = scanner.nextInt();
        System.out.println("enter your stop:");
        int stop = scanner.nextInt();
        int [] result = numbers(inputer,start,stop,row);
        System.out.println(Arrays.toString(result));


    }


    public static int [] numbers(int [][] numbs, int start ,int stop,int row){
        int [] dataSet = new int[numbs.length];
        int count = 0;
            for(int number2 = start  ; number2 <= stop;number2++){
                dataSet[count] = numbs[row][number2];
                count ++;



            }
        return dataSet;
    }

}
