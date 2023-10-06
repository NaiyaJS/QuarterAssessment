package quarterAssess;
import java.util.*;
public class VehicleApp {
    public static void printListsOfVehicleNames(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass());
        }
    }

    public static void PrintAndSortFlyableObjects(List<Flyable>flyableObjects) {
        Collections.sort(flyableObjects, new Comparator<Flyable>() {
            @Override
            public int compare(Flyable o1, Flyable o2) {
                return o1.getClass().compareTo(o2.getClass());
            }
        });
        System.out.println("Sorted List of Flying Objects: ");
        for(Flyable flyableObject : flyableObjects){
            System.out.println(flyableObjects.getClass());
        }
    }

    public static void printDriveableVehicleSpeeds(Lists<Drivable> drivableVehicles){
        System.out.println();
    }
}
