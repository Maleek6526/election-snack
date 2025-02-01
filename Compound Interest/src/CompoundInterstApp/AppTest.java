package CompoundInterstApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testForUsersAnnualCompounding() {
        double result = App.calculateCompoundInterest(1000, 5, 1, 1);
        assertEquals(1050.0, result, 0.01);
    }

    @Test
    public void testForUsersMonthlyCompounding() {
        double result = App.calculateCompoundInterest(300000, 5, 5, 12);
        assertEquals(385007.60, result, 0.01);
    }

    @Test
    public void testForUsersQuarterlyCompounding() {
        double result = App.calculateCompoundInterest(2000, 3, 10, 4);
        assertEquals(2696.70, result, 0.01);
    }

    @Test
    public void testForZeroTime() {
        double result = App.calculateCompoundInterest(1000, 5, 0, 1);
        assertEquals(1000.0, result, 0.01);
    }

    @Test
    public void testZeroRate() {
        double result = App.calculateCompoundInterest(5000, 0, 5, 12);
        assertEquals(5000.0, result, 0.01);
    }
}

