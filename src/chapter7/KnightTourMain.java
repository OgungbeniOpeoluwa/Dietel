package chapter7;

public class KnightTourMain {


    public void  displayTable(int movement){
        moveKnight(movement);
    }


    private int currentColumn = 4;

    private int currentRow = 3;
    private int [] [] square = new int[8][8];
    static int move = 1;

    public  int[] getPosition() {
        return new int[]{currentRow,currentColumn};
    }
    public int increaseBoardValue(){
        square[currentRow][currentColumn] = move;
        move++;
        return move;

    }
    public void moveKnight(int movement) {
        currentRow += verticalMoves(movement);
        currentColumn += horizontalMoves(movement);
    }
    public static int horizontalMoves(int input) {
        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        return horizontal[input];
    }

    public static int verticalMoves(int input) {
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
        return vertical[input];
    }
}
