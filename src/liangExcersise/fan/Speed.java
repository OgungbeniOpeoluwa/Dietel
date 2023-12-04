package liangExcersise.fan;

public enum Speed {
    SLOW(1),MEDIUM(2),FAST(3);

    private final int value;

    Speed(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }


}
