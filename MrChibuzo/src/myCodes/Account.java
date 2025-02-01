package myCodes;

public class Account {
    private String name;

    private String phoneNumber;
    private String pin;
    private double balance;

    private double deposit;



    public void deposit(double amount){
        if (amount > 0.0){
            balance += amount;
        }
    }

    public double getBalance(){
        return balance;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getDeposit(){
        return deposit;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPin(String pin){
        this.pin = pin;
    }

    public String getPin(){
        return pin;
    }

    public void withdraw(double amount) {
        if (amount > 0.0 && balance >= amount) {
            balance -= amount;
        }
    }
}
