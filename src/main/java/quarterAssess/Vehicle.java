package quarterAssess;

public abstract class Vehicle extends Product{
    private int speed;
    private double price;
    private Engine engine;
     final double TAX_AMT = 0.10; //cast to float return(float)

    public Vehicle(String name, int speed, double price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }
    public double getPriceAfterTax() {
       return price + (1 * TAX_AMT);
    }
    public abstract void printVehicleType();


}
