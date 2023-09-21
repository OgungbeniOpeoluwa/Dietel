package chapter3;

public class Clock {

        private int hour;
        private int minutes;
        private int  second;

        public Clock(int hour, int minutes, int second){
            this.hour = hour;
            this.minutes = minutes;
            this.second = second;
        }


        public void setMinutes(int minutes){
            if(minutes > 59){
                this.minutes = 0;
            }
            else{this.minutes = minutes;}
        }

        public void setHour(int hour){
            if(hour > 23){
                this.hour = 0;
            }
            else{this.hour = hour;}
        }

        public void setSecond(int second){
            if(second > 59){
                this.second = 0;
            }
            else{this.second = second;}
        }
        public String displayClock(){
            return String.format("%d:%d:%d",getHour(),getMinutes(),getSecond());

        }

        public int getHour(){
            return hour;
         }

        public int getMinutes(){
            return minutes;
        }

        public int getSecond(){
            return second;
        }
    }

