public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===========");
        System.out.println(" UC20 Fail-Fast Validation ");
        System.out.println("===========\n");

        // ✅ Empty bogie array (train has no bogies)
        String[] bogieIds = {};

        // ✅ Search key
        String searchId = "B0101";

        try {
            // ✅ FAIL-FAST VALIDATION
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in the train!");
            }

            // ✅ SEARCH LOGIC (runs only if data exists)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // ✅ Display result
            if (found) {
                System.out.println("Bogie ID " + searchId + " found.");
            } else {
                System.out.println("Bogie ID " + searchId + " NOT found.");
            }

        } catch (IllegalStateException e) {
            // ✅ Meaningful message
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}