package AccountTest;

import java.util.ArrayList;
public class Bank {
    ArrayList<Account> database = new ArrayList<>();
    private double balance;
    private int counter = 0;
    private int accountNumber;

    public Bank(){
        this.balance = 0;
    }

    public void addAccount(String firstName, String lastName, String pinCode) {
        Account newAccount = new Account(firstName, lastName, pinCode);
        database.add(newAccount);
        counter++;
        accountNumber++;
    }
    public int getCounter(){
        return counter;
    }

    public Account findAccount(int accountNumber) {
        validation(accountNumber);
        return database.get(accountNumber-1);
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    private void validation(int accountNumber){
        if(accountNumber <= 0 || accountNumber > database.size()) {
            throw new IllegalArgumentException("Account not found");
        }
    }

    public void depositInto(Account account, double amount){
        validation(accountNumber);
        checkAmountValidation(amount);
        findAccount(accountNumber).getDeposit(amount);

    }

    private void checkAmountValidation(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid Amount for deposit");
        }

    }


}
