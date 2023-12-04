package liangExcersise.fan;

public class Fan {

    private int speed = Speed.SLOW.getValue();
    private boolean on = false;
    private double radius = 5;
    private String colour = "blue";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        if(on) {
            return String.format("Speed: %d  Radius: %.1f  Colour:%s", getSpeed(), getRadius(), getColour());
        }
        else return String.format("Radius: %.1f  Colour:%s  Fan is off", getRadius(), getColour());
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed.getValue();
    }

    public boolean getOn() {
        return on;
    }

    public void isOn() {
        this.on = true;
    }
}
