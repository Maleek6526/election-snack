package myCodes;

public class AccountTrial {

    private double balance;


    public double getBalance(){
        return balance;
    }
    public void deposit(int amount) {
        if(amount > 0){
            balance += amount;
        }
    }

    public void getWithdrawer(int amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
        }
    }
}
