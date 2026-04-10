import java.util.Arrays;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===========");
        System.out.println(" UC19 Binary Search for Bogie ID ");
        System.out.println("===========\n");

        // ✅ Create array of bogie IDs
        String[] bogieIds = {"B6101", "B6205", "B6309", "B6412", "B0550"};

        // ✅ Sort array (precondition for binary search)
        Arrays.sort(bogieIds);

        // ✅ Search key
        String key = "B6309";

        // ✅ Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }
        System.out.println("\n");

        // ✅ Binary Search Logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;   // search left
            } else {
                low = mid + 1;    // search right
            }
        }

        // ✅ Display result
        if (found) {
            System.out.println("Bogie ID " + key + " found.");
        } else {
            System.out.println("Bogie ID " + key + " NOT found.");
        }
    }
}