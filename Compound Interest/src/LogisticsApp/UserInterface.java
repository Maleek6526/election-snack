package LogisticsApp;

import java.util.Scanner;

public class UserInterface {
    private static Logistics logistics = new Logistics();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        String menu = """
                Welcome to my logistics App
                1 -> Create Shipment
                2 -> Add Driver
                3 -> Assign Driver
                4 -> Track Shipment
                5 -> Exit
                """;
        System.out.println(menu);

        int usersChoice = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        switch (usersChoice) {
            case 1 -> createShipments();
            case 2 -> addDriver();
            case 3 -> assignDriver();
            case 4 -> trackShipment();
            case 5 -> exit();
            default -> {
                System.out.println("Please enter a valid option.");
                mainMenu();
            }
        }
    }

    private static void createShipments() {
        try {
            System.out.println("Please enter the shipment name: ");
            String shipmentName = scanner.nextLine();
            System.out.println("Please enter the shipment address: ");
            String shipmentAddress = scanner.nextLine();
            Shipment shipment = new Shipment(shipmentName, shipmentAddress);
            logistics.addShipment(shipment);
            System.out.println("Shipment created successfully.");
            mainMenu();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            mainMenu();
        }
    }

    private static void addDriver() {
        System.out.println("Enter the driver's name: ");
        String driverName = scanner.nextLine().trim();

        System.out.println("Enter the driver's license number: ");
        String licenseNumber = scanner.nextLine().trim();

        try {
            logistics.findDriver(driverName);
            System.out.println("Driver already exists.");
            mainMenu();
        } catch (IllegalArgumentException e) {
            Driver driver = new Driver(driverName, licenseNumber);
            logistics.addDriver(driver);
            System.out.println("Driver added successfully.");
            mainMenu();
        }
    }

    private static void assignDriver() {
        try {
            System.out.println("Please enter the shipment name: ");
            String shipmentName = scanner.nextLine();
            Shipment shipment = logistics.findShipment(shipmentName);

            System.out.println("Please enter the driver's name: ");
            String driverName = scanner.nextLine();
            Driver driver = logistics.findDriver(driverName);

            shipment.setDriver(driver);
            System.out.println("Driver assigned successfully.");
            mainMenu();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            mainMenu();
        }
    }

    private static void trackShipment() {
        try {
            System.out.println("Please enter the shipment name: ");
            String shipmentName = scanner.nextLine();
            Shipment shipment = logistics.findShipment(shipmentName);
            System.out.println("Shipment Status: " + shipment.getStatus());
            mainMenu();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            mainMenu();
        }
    }

    private static void exit() {
        String exit = """
                Exiting the app...
                Thanks for using my App!
                """;
        System.out.println(exit);
    }
}
