package tdd;

public class AutomaticBike {
     private boolean isOn;
     private int speed;

     public void setOn(){
        isOn = !isOn;
    }

    public boolean isOn(){
        return isOn;
    }

    public void accelerate() {
        if (speed < 20) {
            speed = speed + 1;
        }
        else if (speed >= 20 && speed <= 30) {
            speed = speed + 2;
        }
        else if (speed >= 30 && speed <= 40) {
            speed = speed + 3;
        } else {
            speed = speed + 4;
        }

    }

    public void decelerate(){
        if(speed < 20) {
           speed = speed -1;
        }
        else if(speed >= 20 && speed <=30){
            speed = speed - 2;
        }

        else if(speed >= 30 && speed <= 40) {
            speed = speed - 3;
        }
          else{
            speed = speed - 4;
        }
          if(speed < 0){
              speed = 0;
          }

    }



        public int checkSpeed(){
            return speed;

        }


}

