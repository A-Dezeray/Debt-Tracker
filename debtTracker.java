import java.util.Scanner;
// Create public class debtTracker
public class debtTracker {

  // Create a Scanner object to get user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize debt to zero
        double debt = 0.0;

        while (true) {
            // Display menu
            System.out.println("\nDebt Tracker Menu:");
            System.out.println("1. View Current Debt");
            System.out.println("2. Add to Debt");
            System.out.println("3. Pay Debt");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            // Get user input for menu choices
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View current debt
                    System.out.println("Current Debt: $" + debt);
                    break;

                case 2:
                    // Add to debt
                    System.out.print("Enter the amount to add to debt: $");
                    double amountToAdd = scanner.nextDouble();
                    debt += amountToAdd;
                    System.out.println("Added $" + amountToAdd + " to debt. Current Debt: $" + debt);
                    break;

                case 3:
                    // Pay debt
                    System.out.print("Enter the amount to pay off debt: $");
                    double amountToPay = scanner.nextDouble();
                    if (amountToPay <= debt) {
                        debt -= amountToPay;
                        System.out.println("Paid off $" + amountToPay + ". Current Debt: $" + debt);
                    } else {
                        System.out.println("Error: Cannot pay more than the current debt.");
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting Debt Tracker. Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
