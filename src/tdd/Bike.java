package tdd;

public class Bike {
    private String name;
    private boolean isOn = false;

    //public Bike(boolean isOn) {
        //this.isOn = isOn;
    //}


    public void setOn(boolean isOn){
        this.isOn = isOn;
    }


    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
            return isOn;
        }


        public String getName() {
            return name;
        }
    }

