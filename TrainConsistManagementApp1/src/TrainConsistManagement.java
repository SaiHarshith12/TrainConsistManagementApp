import java.util.*;

public class TrainConsistManagement {

    // ✅ CUSTOM RUNTIME EXCEPTION
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ✅ Goods Bogie Model
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // ✅ Assign cargo with validation
        void assignCargo(String cargo) {
            try {
                // ❌ Rule: Rectangular bogie cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Petroleum not allowed in Rectangular bogie!"
                    );
                }

                // ✅ If valid, assign cargo
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + shape + " -> " + cargo);

            } catch (CargoSafetyException e) {
                // ✅ Handle exception inside method
                System.out.println("Error: " + e.getMessage());

            } finally {
                // ✅ Always executes
                System.out.println("Assignment attempt completed.\n");
            }
        }

        @Override
        public String toString() {
            return shape + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Cargo Safety Validation ===\n");

        // Create bogies
        GoodsBogie g1 = new GoodsBogie("Rectangular");
        GoodsBogie g2 = new GoodsBogie("Cylindrical");

        // ❌ Invalid assignment
        g1.assignCargo("Petroleum");

        // ✅ Valid assignments
        g1.assignCargo("Coal");
        g2.assignCargo("Petroleum");

        System.out.println("Application continues after handling exceptions...");
    }
}