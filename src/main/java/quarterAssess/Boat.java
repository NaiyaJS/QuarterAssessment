package quarterAssess;

public class Boat extends Vehicle implements Drivable{
    private boolean hasGPS;
    public Boat(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }

    @Override
    public void printVehicleType() {
        System.out.println("Boat");
    }
    
    @Override
    public void printSpeed() {

    }
}
