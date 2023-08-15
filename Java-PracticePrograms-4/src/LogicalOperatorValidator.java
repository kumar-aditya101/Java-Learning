import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Is input valid (true/false): ");
        boolean isInputValid = scanner.nextBoolean();

        System.out.print("Does input meet a certain condition (true/false): ");
        boolean meetsCondition = scanner.nextBoolean();

        scanner.close();

        boolean isValid = isValidInput(isInputValid, meetsCondition);

//        System.out.println("Is input valid (true/false): " + isInputValid);
//        System.out.println("Does input meet a certain condition (true/false): " + meetsCondition);

        if (isValid) {
            System.out.println("Input is valid.");
        } else {
            System.out.println("Input is not valid.");
        }
    }

    public static boolean isValidInput(boolean isInputValid, boolean meetsCondition) {
        // Combine conditions using logical operators
        boolean isValid = isInputValid && meetsCondition;

        return isValid;

}
}
