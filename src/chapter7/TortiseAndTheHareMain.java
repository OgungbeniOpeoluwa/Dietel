package chapter7;

import java.util.Arrays;

public class TortiseAndTheHareMain {

    public static void main(String[] args) {
        TortiseAndTheHare game = new TortiseAndTheHare();
        String [] tortise = new String[70];
        String [] hare = new String[70];

        for(int count = 1; count < 70; count++) {
           // game.tortiseMove(game.play());
            game.hareMove(game.play());
         //   tortise[game.getTort isePosition()] = "T";
            hare[game.getHarePosition()] = "H";

        }
        System.out.println(Arrays.toString(tortise));
        System.out.println(Arrays.toString(hare));
    }
}
