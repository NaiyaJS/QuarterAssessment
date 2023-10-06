package quarterAssess;

public class Drone implements Flyable{
    private String name;

    public Drone(String name) {
        this.name = name;
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }

}
