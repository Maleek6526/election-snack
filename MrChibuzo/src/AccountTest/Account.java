package AccountTest;

public class Account {
    private String firstName;
    private String lastName;
    private String pinCode;
    private double balance;

    public Account(String firstName, String lastName, String pinCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinCode = pinCode;
    }

    public String getFullName(){
        return firstName+ " " + lastName;
    }

    public double getBalance(){
        return balance;
    }

    public void getDeposit(double amount){
        if(amount > 0){
            balance+=amount;
        }
        else{
            throw new IllegalArgumentException("Invalid Amount for deposit!");
        }
    }

    public void getWithdrawer(double amount, String pinCode){
        validatePin(pinCode);
        if(amount <= balance){
            balance-=amount;
        }
        else {
            throw new IllegalArgumentException("Invalid amount for withdraw!");
        }
    }

    public void validatePin(String pinCode){
        if(!pinCode.equals(this.pinCode)){
            throw new IllegalArgumentException("Incorrect pincode");
        }
    }
}
