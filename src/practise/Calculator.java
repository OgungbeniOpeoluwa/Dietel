package practise;

import javax.swing.*;

public class Calculator{
    public static void main(String[] args){
            Calculator2 cal = new Calculator2();
            String userInput = JOptionPane.showInputDialog("PLEASE ENTER YOUR ARITHMETIC NUMBER");
            cal.calculator(userInput);
            System.out.println(cal.getFinalResult());
        }

    }

