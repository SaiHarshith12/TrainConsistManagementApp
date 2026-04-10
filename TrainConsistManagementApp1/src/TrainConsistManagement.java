import java.util.*;

public class TrainConsistManagement {

    // ✅ Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ✅ Bogie Class with Validation
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("UC14 Handle Invalid Bogie Capacity");

        List<Bogie> bogies = new ArrayList<>();

        try {
            // ✅ Valid bogie
            Bogie b1 = new Bogie("Sleeper", 72);
            bogies.add(b1);
            System.out.println("Created Bogie: " + b1);

            // ❌ Invalid bogie
            Bogie b2 = new Bogie("AC Chair", 0);
            bogies.add(b2); // This line will never execute

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("UC14 exception handling completed...");
    }
}