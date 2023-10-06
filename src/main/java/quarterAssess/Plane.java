package quarterAssess;

public class Plane extends Vehicle implements Flyable{

    public Plane(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
        System.out.println("Plane");
    }

    @Override
    public boolean transportsPassengers() {
        return true;
    }
}
