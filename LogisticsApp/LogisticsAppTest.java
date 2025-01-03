package LogisticsApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogisticsAppTest {

    @Test
    public void testAddShipment() {
        Logistics logistics = new Logistics();
        Shipment shipment = new Shipment("Package1", "123 Main Street");
        logistics.addShipment(shipment);

        assertEquals(1, logistics.getShipments().size());
        assertEquals("Package1", logistics.getShipments().get(0).getName());
        assertEquals("123 Main Street", logistics.getShipments().get(0).getAddress());
    }

    @Test
    public void testAddDriver() {
        Logistics logistics = new Logistics();
        Driver driver = new Driver("Ade Wale", "JD12345");
        logistics.addDriver(driver);

        assertEquals(1, logistics.getDrivers().size());
        assertEquals("Ade Wale", logistics.getDrivers().get(0).getName());
        assertEquals("JD12345", logistics.getDrivers().get(0).getLicenseNumber());
    }

    @Test
    public void testAssignDriverToShipment() {
        Logistics logistics = new Logistics();
        Driver driver = new Driver("Ade Wale", "JD12345");
        Shipment shipment = new Shipment("Package1", "123 Main Street");
        logistics.addDriver(driver);
        logistics.addShipment(shipment);
        shipment.setDriver(driver);
        assertEquals("In Transit", shipment.getStatus());
        assertEquals("Ade Wale", shipment.getDriver().getName());
    }

    @Test
    public void testFindShipment() {
        Logistics logistics = new Logistics();
        Shipment shipment = new Shipment("Package1", "123 Main Street");
        logistics.addShipment(shipment);
        Shipment foundShipment = logistics.findShipment("Package1");
        assertNotNull(foundShipment);
        assertEquals("Package1", foundShipment.getName());
    }

    @Test
    public void testFindDriver() {
        Logistics logistics = new Logistics();
        Driver driver = new Driver("Ade Wale", "JD12345");
        logistics.addDriver(driver);
        Driver foundDriver = logistics.findDriver("Ade Wale");
        assertNotNull(foundDriver);
        assertEquals("Ade Wale", foundDriver.getName());
    }

    @Test
    public void testDriverAlreadyExists() {
        Logistics logistics = new Logistics();
        Driver driver = new Driver("Ade Wale", "JD12345");
        logistics.addDriver(driver);
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            logistics.addDriver(driver);
        });
        assertEquals("Driver already exists!", thrown.getMessage());
    }

    @Test
    public void testShipmentNotFound() {
        Logistics logistics = new Logistics();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            logistics.findShipment("NonExistentPackage");
        });
        assertEquals("Shipment cannot be found!", thrown.getMessage());
    }
}
