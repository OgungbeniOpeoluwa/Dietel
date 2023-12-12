package liangExcersise;

public enum AlphabetValue {
    ABC(2),DEF(3),GHI(4),JKL(5),MNO(6),PQRS(7),TUV(8),WXYZ(9);
    private int value;


    AlphabetValue(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
