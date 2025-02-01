package CompoundInterstApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCalculateCompoundInterestWithValidInputs() {
        App calculate = new App();
        double initialInvestment = 1000.0;
        double monthlyContribution = 100.0;
        double annualInterestRate = 5.0 / 100;
        int years = 5;
        int compoundFrequency = 12;

        double result = calculate.calculateCompoundInterest(
                initialInvestment, monthlyContribution, annualInterestRate, years, compoundFrequency);

        double expected = 8222.99;

        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testCalculateCompoundInterestWithZeroInitialInvestment() {
        App calculate = new App();
        double initialInvestment = 0.0;
        double monthlyContribution = 200.0;
        double annualInterestRate = 3.0 / 100;
        int years = 10;
        int compoundFrequency = 12;

        double result = calculate.calculateCompoundInterest(
                initialInvestment, monthlyContribution, annualInterestRate, years, compoundFrequency);

        double expected = 28175.29;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testCalculateCompoundInterestWithZeroMonthlyContribution() {
        App calculate = new App();
        double initialInvestment = 5000.0;
        double monthlyContribution = 0.0;
        double annualInterestRate = 7.0 / 100;
        int years = 15;
        int compoundFrequency = 1;

        double result = calculate.calculateCompoundInterest(
                initialInvestment, monthlyContribution, annualInterestRate, years, compoundFrequency);

        double expected = 13897.98;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testCalculateCompoundInterestWithNegativeContribution() {
        App calculate = new App();
        double initialInvestment = 10000.0;
        double monthlyContribution = -200.0;
        double annualInterestRate = 4.0 / 100;
        int years = 3;
        int compoundFrequency = 12;

        double result = calculate.calculateCompoundInterest(
                initialInvestment, monthlyContribution, annualInterestRate, years, compoundFrequency);

        double expected = 5246.93;
        assertEquals(expected, result, 0.01);
    }
}


