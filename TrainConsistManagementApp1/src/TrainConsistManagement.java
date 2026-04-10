import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ✅ Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // ✅ Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // ✅ Create matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ✅ Validate using matches()
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid ✅");
        } else {
            System.out.println("Invalid Train ID ❌");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid ✅");
        } else {
            System.out.println("Invalid Cargo Code ❌");
        }

        scanner.close();
    }
}