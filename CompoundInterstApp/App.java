package CompoundInterstApp;

public class App {
    public double calculateCompoundInterest(double initialInvestment, double monthlyContribution,
                                            double annualInterestRate, int years, int compoundFrequency) {
        double totalAmount = initialInvestment;
        int totalPeriods = years * compoundFrequency;
        double periodicRate = annualInterestRate / compoundFrequency;

        for (int i = 0; i < totalPeriods; i++) {
            if (i % (compoundFrequency / 12) == 0) {
                totalAmount += monthlyContribution;
            }
            totalAmount *= (1 + periodicRate);
        }

        return totalAmount;
    }
}
