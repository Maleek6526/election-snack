package AccountProject;

import java.util.ArrayList;

public class MyBank {
    private ArrayList<MyAccount> dataBase;
    private int counter = 0;
    private int accountNumber;
    private float balance;
    private String bankName;

    public MyBank(String bankName) {
        dataBase = new ArrayList<>();
        this.bankName = bankName;
    }

    public void createNewAccount(String firstName, String lastName, String pinCode) {
        String fullName = firstName + " " + lastName;
        this.accountNumber = counter + 1;
        MyAccount newAccount = new MyAccount(fullName, pinCode, accountNumber);
        dataBase.add(newAccount);
        counter++;
    }

    public int getNumberOfAccounts() {
        return counter;
    }

    public int getAccountNumber() {
        return counter;
    }

    public void deposit(int accountNumber, float amount) {
        MyAccount account = findAccount(accountNumber);
        account.getDeposit(amount);
    }

    public double getBalance(int accountNumber, String pinCode) {
        MyAccount account = findAccount(accountNumber);
        return account.getBalance();
    }

    public void withdraw(int accountNumber, String pinCode, float amount) {
        MyAccount account = findAccount(accountNumber);
        account.getWithdraw(pinCode, amount);
    }

    public void transfer(int senderAccount, int receiverAccount, float amount, String pinCode, MyBank receiverBank) {
        MyAccount sender = findAccount(senderAccount);
        MyAccount receiver = findAccount(receiverAccount);
        sender.getWithdraw(pinCode, amount);
        receiver.getDeposit(amount);
    }

    public void interBankTransfer(int senderAccount, int receiverAccount, float amount, String senderPinCode, MyBank receiverBank) {
        MyAccount sender = findAccount(senderAccount);
        MyAccount receiver = receiverBank.findAccount(receiverAccount);

        if (sender == null) {
            throw new IllegalArgumentException("Sender Account not found.");
        }

        if (receiver == null) {
            throw new IllegalArgumentException("Receiver Account not found in the receiver bank.");
        }

        if (!sender.getPinCode().equals(senderPinCode)) {
            throw new IllegalArgumentException("Sender Invalid PIN code.");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be greater than zero.");
        }

        if (sender.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient funds in sender's account.");
        }

        sender.getWithdraw(senderPinCode, amount);
        receiver.getDeposit(amount);

        System.out.println("Inter-bank transfer successful from Bank: " + this.bankName + " to Bank: " + receiverBank.getBankName());
    }



    private MyAccount findAccount(int accountNumber) {
        for (MyAccount account : dataBase) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        throw new IllegalArgumentException("Account not found.");
    }

    public String getBankName() {
        return bankName;
    }
}
