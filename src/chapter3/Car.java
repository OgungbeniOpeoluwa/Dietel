package chapter3;

public class Car {

        private String carModel;
        private String year;
        private double price;

        public Car(String model, String year, double price){
            carModel = model;
            this.year = year;
            this.price = price;
        }

        public void setModel(String model){
            carModel = model;
        }

        public void setYear(String year){
            this.year = year;
        }

        public void setPrice(double price){
            if(price < 0){
                this.price = 0;
                //System.out.println("car has no value");
            }
            else{this.price = price;}
        }



        public String getModel(){
            return carModel;
        }

        public String getYear(){
            return year;
        }

        public double getPrice(){
            return price;
        }


    public  void  discountPrice(double percent){
            double divide = percent/100;
           price = price - (price * divide);

    }

    }

