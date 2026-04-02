import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== UC3: Track Unique Bogie IDs ===\n");

        // Create a HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIDs.add("B6101");
        bogieIDs.add("B6102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");
        bogieIDs.add("B6101"); // duplicate
        bogieIDs.add("BG104"); // duplicate

        // Print the final set
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed...");
    }
}