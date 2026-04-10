import java.util.*;

public class TrainConsistManagement {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ✅ Aggregate using map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, Integer::sum); // sum all

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);
    }
}