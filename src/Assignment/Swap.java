package Assignment;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Swap {

    public static int [] numb (int [] numbs,int count,int result) {
        numbs[count] = numbs[count] + numbs[result];
        numbs[result] = numbs[count] - numbs[result];
        numbs[count] = numbs[count] - numbs[result];

        return numbs;
    }

  public static void main(String[] args) {
       System.out.println(Arrays.toString(numb(new int[]{1, 2, 3, 4, 5}, 1, 4)));
   }
}
