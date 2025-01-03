import java.util.Scanner;
public class CompoundInterestApps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter the compounding frequency: ");
        int frequency = scanner.nextInt();

        double rateCalculation = rate / 100;
        double amount = principal * Math.pow(1 + (rateCalculation / frequency), frequency * time);
        System.out.printf("The final amount after %.2f years is: %.2f%n", time, amount);
    }
}