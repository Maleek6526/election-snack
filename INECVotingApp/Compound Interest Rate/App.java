import java.util.Scanner;
public class App {
    public class SimpleCompoundInterestApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user for input
            System.out.print("Enter the principal amount (P): ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the annual interest rate (r%) (e.g., 5 for 5%): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the time in years (t): ");
            double time = scanner.nextDouble();

            System.out.print("Enter the compounding frequency (n) (e.g., 12 for monthly): ");
            int frequency = scanner.nextInt();

            // Convert the interest rate to decimal
            rate = rate / 100;

            // Calculate compound interest
            double amount = principal * Math.pow(1 + (rate / frequency), frequency * time);

            // Display the result
            System.out.printf("The final amount (A) after %.2f years is: %.2f%n", time, amount);

            scanner.close();
        }
    }
}
