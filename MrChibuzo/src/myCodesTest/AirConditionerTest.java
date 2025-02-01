package myCodesTest;

import myCodes.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    private static AirConditioner ac = new AirConditioner();

    @Test
    public void testTurnOn() {
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    public void testTurnOff() {
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    public void testIncreaseTemperature() {
        int initialTemperature = ac.getTemperature();
        ac.increaseTemperature();
        assertEquals(initialTemperature + 1, ac.getTemperature());
    }

    @Test
    public void testDecreaseTemperature() {
        int initialTemperature = ac.getTemperature();
        ac.decreaseTemperature();
        assertEquals(initialTemperature - 1, ac.getTemperature());
    }

    @Test
    public void testIncreaseTemperatureBeyondMax() {
        for (int temp = 0; temp < 20; temp++) {
            ac.increaseTemperature();
        }
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void testDecreaseTemperatureBelowMin() {
        for (int temp = 0; temp < 20; temp++) {
            ac.decreaseTemperature();
        }
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }
}
