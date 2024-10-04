import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their weekly income
        System.out.print("Enter the weekly income: ");
        double income = scanner.nextDouble(); // Capture the income input

        // Variable to store the tax rate based on income
        double taxRate;

        // Determine the tax rate based on the income brackets
        if (income < 500) {
            taxRate = 0.10; // 10% tax for incomes less than $500
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15; // 15% tax for incomes between $500 and $1500
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20; // 20% tax for incomes between $1500 and $2500
        } else {
            taxRate = 0.30; // 30% tax for incomes greater than or equal to $2500
        }

        // Calculate the tax withholding based on the income and tax rate
        double taxWithholding = income * taxRate;

        // Output the result, showing the tax withholding for the entered income
        System.out.printf("The weekly tax withholding for an income of $%.2f is $%.2f.%n", income, taxWithholding);

        // Prompt the user to press Enter to close the program
        System.out.println("Press Enter to close the program...");
        scanner.nextLine(); // Consume the leftover newline
        scanner.nextLine(); // Wait for the user to press Enter

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
