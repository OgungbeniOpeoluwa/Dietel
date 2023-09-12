package chapter3;

public class CarTest {
        public static void main(String[] args){

            Car car1 = new Car("Toyota", "twentyTen", 0);
            Car car2 = new Car( "Lexus", "twentySixteen",0);

            System.out.printf("first car price is : %f%n", car1.getPrice());
            System.out.printf("Second  car price is : %f%n", car2.getPrice());

            car1.setModel("Camry");
            car1.setYear("TwentyFiften");
            car1.setPrice(5000);

            car2.setModel("Toyota");
            car2.setYear("TwentyTen");
            car2.setPrice(8000);


            System.out.printf("%s %f%n", car1.getModel(), car1.getPrice());
            System.out.printf("%s %f%n", car2.getModel(), car2.getPrice());

            double discount1 = car1.getPrice() * 0.005;
            double discount2 = car2.getPrice() * 0.007;

            System.out.printf("First car discount price is :%.4f%n", discount1);
            System.out.printf("Second car discount price is :%.4f%n", discount2);

        }

}
