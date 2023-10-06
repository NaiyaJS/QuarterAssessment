package quarterAssess;

public class FlyingCar extends Vehicle implements Drivable implements Flyable {
    private String websiteLink;

    public FlyingCar(String name, int speed, double price, Engine engine, String websiteLink) {
        super(name, speed, price, engine);
        this.websiteLink = websiteLink;
    }

    public String getWebsiteLink(){
        return websiteLink;
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void printVehicleType() {

    }
    @Override
    public void printSpeed() {

    }
}
