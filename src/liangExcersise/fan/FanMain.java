package liangExcersise.fan;

import static liangExcersise.fan.Speed.FAST;
import static liangExcersise.fan.Speed.MEDIUM;

public class FanMain {
    public static void main(String[] args) {
        Fan lgFan = new Fan();
        Fan sonicFan = new Fan();
        lgFan.isOn();
        lgFan.setSpeed(FAST);
        lgFan.setRadius(10);
        lgFan.setColour("Yellow");

        sonicFan.setSpeed(MEDIUM);
        sonicFan.setRadius(5);
        sonicFan.setColour("Blue");

        System.out.println("LgFan = "+ lgFan);
        System.out.println();
        System.out.println("SonicFan = "+ sonicFan);
    }
}
