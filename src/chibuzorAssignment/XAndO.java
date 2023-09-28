package chibuzorAssignment;

import com.sun.jdi.PathSearchingVirtualMachine;

public class XAndO {
    public static void main(String[] args) {
        char [][] games ={{'X','O','X'},{'X','X','0'}, {'O','X','X'}};
        for(int count = 0;count < 3;count ++) {
            for (int counter = 0; counter < 3; counter++) {
                System.out.print(games[count][counter] + " ");
            }
            System.out.println();
        }
        }
    }

