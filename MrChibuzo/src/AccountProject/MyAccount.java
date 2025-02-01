package AccountProject;

public class MyAccount {
    private String name;
    private float balance;
    private String pinCode;
    private int accountNumber;

    public MyAccount(String name, String pinCode, int accountNumber) {
        this.name = name;
        this.pinCode = pinCode;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void getDeposit(float amount) {
        if (amount > 0.0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Invalid amount for deposit");
        }
    }

    public void getWithdraw(String pinCode, float amount) {
        validatePin(pinCode);
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
    }

    private void validatePin(String pinCode) {
        if (!pinCode.equals(this.pinCode)) {
            throw new IllegalArgumentException("Incorrect pincode entered, please try again");
        }
    }

    public String getPinCode() {
        return pinCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
