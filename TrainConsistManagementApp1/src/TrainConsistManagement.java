import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== UC4: Maintain Ordered Bogie Consist ===\n");

        // Create a LinkedList for the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add initial bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (0-based index)
        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove the first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}