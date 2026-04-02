import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== UCS: Preserve Insertion Order of Bogies ===\n");

        // Create a LinkedHashSet to represent the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie intentionally
        trainFormation.add("Sleeper"); // duplicate

        // Display the final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println("UCS formation setup completed...");
    }
}