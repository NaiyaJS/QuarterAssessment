package quarterAssess;

public class Truck extends Vehicle implements Drivable{

    public Truck(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
        System.out.println("Truck");
    }

    @Override
    public void printSpeed() {

    }
}
