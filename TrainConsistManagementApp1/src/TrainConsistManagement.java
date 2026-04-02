import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize an empty list for train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display current train consist
        System.out.println("\nCurrent Train Consist:");
        if (trainConsist.isEmpty()) {
            System.out.println("No bogies attached yet.");
        } else {
            for (String bogie : trainConsist) {
                System.out.println("- " + bogie);
            }
        }

        // Indicate system readiness
        System.out.println("\nSystem ready for operations.\n");
    }
}