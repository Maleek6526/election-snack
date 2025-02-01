package LogisticsApp;

import java.util.ArrayList;

public class Logistics {
    private static ArrayList<Shipment> shipments;
    private static ArrayList<Driver> drivers;

    public Logistics(){
        shipments = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    public ArrayList<Shipment> getShipments() {
        return shipments;
    }
    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public Shipment findShipment(String shipmentName) {
        for (Shipment shipment : shipments) {
            if (shipment.getName().equals(shipmentName)) {
                return shipment;
            }
        }
        throw new IllegalArgumentException("Shipment cannot be found!");
    }

    public Driver findDriver(String driverName) {
        for (Driver driver : drivers) {
            if (driver.getName().equals(driverName)) {
                return driver;
            }
        }
        throw new IllegalArgumentException("Driver name cannot be found!");
    }

    public void addShipment(Shipment shipment) {
        shipments.add(shipment);
    }

    public void addDriver(Driver driver) {
        for (Driver existingDriver : drivers) {
            if (existingDriver.getName().equals(driver.getName())) {
                throw new IllegalArgumentException("Driver already exists!");
            }
        }
        drivers.add(driver);
    }
}
