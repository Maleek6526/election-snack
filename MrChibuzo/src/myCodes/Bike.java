package myCodes;

public class Bike {

    private boolean isOn;
    private int speed;
    private int gear;

    public Bike() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
    public void accelerate() {
        if (!isOn) {
            return;
        }

        switch (gear) {
            case 1 : speed += 1;
            case 2 : speed += 2;
            case 3 : speed += 3;
            case 4 : speed += 4;
        }

        updateGear();
    }

    private void updateGear() {
        if (speed <= 20) {
            gear = 1;
        } else if (speed <= 30) {
            gear = 2;
        } else if (speed <= 40) {
            gear = 3;
        } else {
            gear = 4;
        }
    }
}
