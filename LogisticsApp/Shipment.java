package LogisticsApp;

public class Shipment {
    private String name;
    private String address;
    private Driver driver;
    private String status;

    public Shipment(String name, String address){
        this.name = name;
        this.address = address;
        this.status = "pending";
    }

    public String getName(){
        return name;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
        this.status = "In Transit";
    }

    public String getStatus(){
        return status;
    }


    public String getAddress() {
        return address;
    }

    public Driver getDriver() {
        return driver;
    }
}
