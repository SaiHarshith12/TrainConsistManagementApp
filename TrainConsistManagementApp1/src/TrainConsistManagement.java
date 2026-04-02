import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== UC7: Sort Bogies by Capacity (Comparator) ===\n");

        // Create a List<Bogie> to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies with capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        // Display before sorting
        System.out.println("Before Sorting:");
        passengerBogies.forEach(System.out::println);

        // Sort by capacity using Comparator.comparingInt
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting completed....");
    }
}