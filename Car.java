
public class Car extends Vehicle {

    String model;

    public static void main(String[] args) {
        Car myCar = new Car();

        // myCar.brand = myCar.getBrand();
        // myCar.color = "Black";
        // myCar.speed = 150;
        myCar.model = "Civic";

        myCar.setBrand("Honda");
        myCar.setColor("Black");
        myCar.setSpeed(160);

        System.out.println(myCar.getBrand() + " " + myCar.model + " " + myCar.getColor() + " " + myCar.getSpeed());
    }
}
