package AccountProject;

import java.util.Scanner;

public class AccountDriverClass {
    private static MyBank bankA = new MyBank("Zenith");
    private static MyBank bankB = new MyBank("Access");
    private static Scanner scanner = new Scanner(System.in);
    private static BankRegistry bankRegistry = new BankRegistry();

    public static void main(String[] args) {
        bankRegistry.registerBank(bankA);
        bankRegistry.registerBank(bankB);
        mainMenu();
    }

    private static void mainMenu() {
        String menu = """
                Welcome to my dummy bank App
                1 -> Open an Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Inter-bank Transfer
                7 -> Exit
                """;
        System.out.println(menu);
        System.out.println("Enter here: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> openAnAccount();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> transfer();
            case 5 -> checkBalance();
            case 6 -> interBankTransfer();
            case 7 -> exit();
            default -> System.out.println("Please enter the correct number.");
        }
    }

    private static void interBankTransfer() {
        try {
            System.out.println("Enter the sender account number: ");
            int senderAccountNumber = scanner.nextInt();

            System.out.println("Enter the receiver bank name: ");
            scanner.nextLine();
            String receiverBankName = scanner.nextLine();

            MyBank receiverBank = bankRegistry.getBank(receiverBankName);

            if (receiverBank == null) {
                throw new IllegalArgumentException("Receiver bank not found.");
            }

            System.out.println("Enter the receiver account number: ");
            int receiverAccountNumber = scanner.nextInt();

            System.out.println("Enter the amount you want to transfer: ");
            float amount = scanner.nextFloat();

            System.out.println("Enter the sender's pin code: ");
            String sendersPinCode = scanner.next();

            bankA.interBankTransfer(senderAccountNumber, receiverAccountNumber, amount, sendersPinCode, receiverBank);

            mainMenu();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            mainMenu();
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            mainMenu();
        }
    }


    private static void exit() {
        System.out.println("Thanks for using my bank.");
    }

    private static void checkBalance() {
        try {
            System.out.println("Enter your account number: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter your pincode: ");
            String pincode = scanner.next();
            System.out.printf("Your account balance is %,.2f%n", bankA.getBalance(accountNumber, pincode));
            mainMenu();
        }

        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            mainMenu();
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            mainMenu();
        }

    }

    private static void withdraw() {
        try {
            System.out.println("Enter your account number: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter the amount you want to withdraw: ");
            float amount = scanner.nextFloat();
            System.out.println("Enter your pincode: ");
            String pinCode = scanner.next();
            bankA.withdraw(accountNumber, pinCode, amount);
            System.out.printf("You've successfully withdrawn %,.2f%n", amount);
            mainMenu();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            mainMenu();
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            mainMenu();
        }

    }

    private static void deposit() {
        try {
            System.out.println("Enter the account number you want to deposit: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter the amount you want to deposit: ");
            float amount = scanner.nextFloat();
            bankA.deposit(accountNumber, amount);
            System.out.printf("You've successfully deposited %,.2f%n", amount);
            mainMenu();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            mainMenu();
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            mainMenu();
        }

    }

    private static void openAnAccount() {
        try {
            System.out.println("Please enter your first name: ");
            String firstName = scanner.next();
            System.out.println("Please enter your last name: ");
            String lastName = scanner.next();
            System.out.println("Please set your pincode: ");
            String pinCode = scanner.next();
            bankA.createNewAccount(firstName, lastName, pinCode);
            System.out.println("Account created successfully. Your account number is " + bankA.getAccountNumber());
            mainMenu();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            mainMenu();
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            mainMenu();
        }

    }

    private static void transfer() {
        try {
            System.out.println("Enter the sender account number: ");
            int senderAccount = scanner.nextInt();
            System.out.println("Enter the receiver account number: ");
            int receiverAccount = scanner.nextInt();
            System.out.println("Enter your pinCode for the transaction: ");
            String pinCode = scanner.next();
            System.out.println("Enter the amount you want to transfer: ");
            float amount = scanner.nextFloat();
            bankA.transfer(senderAccount, receiverAccount, amount, pinCode, bankA);
            System.out.printf("You've successfully transferred %,.2f%n", amount);
            mainMenu();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            mainMenu();
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            mainMenu();
        }

    }
}
