package quarterAssess;

public class Boat extends Vehicle implements Drivable{
    private boolean hasGPS;
    public Boat(String name, int speed, double price, Engine engine) {
        super(name, 60, 5000.0, engine);
        this.hasGPS = hasGPS;
    }

    @Override
    public void printVehicleType() {
        System.out.println("Boat");
    }

    @Override
    public void printSpeed() {
        System.out.println("Boat Speed: " + getSpeed());
    }
}
