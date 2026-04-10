import java.util.Scanner;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // ✅ Create array of bogie IDs
        String[] bogieIds = {"B6101", "B6205", "B6309", "B6412", "B0550"};

        // ✅ Accept input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchId = scanner.nextLine();

        // ✅ Display all bogies
        System.out.println("\nAvailable Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ✅ LINEAR SEARCH
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {   // ✔ comparison using equals()
                found = true;
                break;                  // ✔ stop when found
            }
        }

        // ✅ Display result
        System.out.println("\n");

        if (found) {
            System.out.println("Bogie ID " + searchId + " found in the list.");
        } else {
            System.out.println("Bogie ID " + searchId + " NOT found.");
        }

        scanner.close();
    }
}