package quarterAssess;

public class Car extends Vehicle implements Drivable{
    private int numberOfDoors;
    private final float EXTRA_TAX = 0.05f;

    public Car(String name, int speed, double price, Engine engine, int numberOfDoors) {
        super(name, speed, price, engine);
        this.numberOfDoors = numberOfDoors;
    }

    public void printNumberofDoors () {
        System.out.println("Number of doors: " + numberOfDoors);

    }

    @Override
    public void printVehicleType() {
        System.out.println("Car");
    }
    //priceafter tax + additional car tax
    public double getPriceAfterTax(){
        return super.getPriceAfterTax() + (getPrice() * EXTRA_TAX);
    }

    @Override
    public void printSpeed() {

    }
}
