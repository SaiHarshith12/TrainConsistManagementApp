import java.util.*;

public class TrainConsistManagement {

    // ✅ Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC12: Safety Compliance Check");
        System.out.println("=================================\n");

        // ✅ Create list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Display data
        System.out.println("Goods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g);
        }

        // ✅ Safety check using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance: " +
                (isSafe ? "SAFE ✅" : "NOT SAFE ❌"));
    }
}