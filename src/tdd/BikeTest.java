package tdd;

public class BikeTest {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setName("Toyota");
        bike.setOn(false);
        System.out.printf("The name of the bike is %s and it is %s ", bike.getName(), bike.isOn()?"On":"Off");

    }
}

