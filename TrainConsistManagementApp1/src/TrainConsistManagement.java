import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== UC6: Map Bogie to Capacity (HashMap) ===\n");

        // Create a HashMap to store bogie-capacity information
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);

        // Display bogie-capacity details
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}