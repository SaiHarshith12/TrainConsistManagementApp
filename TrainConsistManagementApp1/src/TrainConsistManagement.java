public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===========");
        System.out.println(" UC16 Manual Sorting using Bubble Sort ");
        System.out.println("===========\n");

        // ✅ Create array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // ✅ Display original array
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // ✅ BUBBLE SORT
        for (int i = 0; i < capacities.length - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < capacities.length - i - 1; j++) {

                // Swap if left > right
                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // ✅ Display sorted array
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}