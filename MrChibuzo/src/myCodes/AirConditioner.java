package myCodes;

public class AirConditioner {
    private boolean isOn = false;
    private int temperature = 24;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature--;
        }
    }
}