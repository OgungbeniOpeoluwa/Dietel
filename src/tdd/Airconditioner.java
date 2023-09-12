  package tdd;

public class Airconditioner {
private boolean isOn  ;

private int temperature = 16;

    public void toggleOn() {
        isOn = !isOn;
    }
    public boolean isOn(){
        return isOn;
    }

    public void decreaseTemperature(){
            this.temperature--;
            int temperature = 16;
       if(this.temperature < temperature){
           this.temperature = temperature;
        }
    }
        public int temperature(){
            return temperature;
        }

    public void increaseTemperature() {
        this.temperature++;
        int temperature = 30;
        if(this.temperature >= temperature){
            this.temperature = temperature;
        }
    }


        }






