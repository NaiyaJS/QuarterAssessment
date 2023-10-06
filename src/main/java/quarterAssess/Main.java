package quarterAssess;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(Size.MEDIUM);
        Car car = new Car("Mustang", 280, 15000.00, carEngine, 2);
    }

