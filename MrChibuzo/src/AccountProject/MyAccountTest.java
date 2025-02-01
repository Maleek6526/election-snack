package AccountProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyAccountTest {
    @Test
    public void testCreateAccount() {
        MyBank zenithBank = new MyBank("Zenith");
        zenithBank.createNewAccount("ade", "wale", "1234");
        assertEquals(1, zenithBank.getAccountNumber());
        assertEquals(1, zenithBank.getNumberOfAccounts());
    }

    @Test
    public void testDeposit() {
        MyBank zenithBank = new MyBank("Zenith");
        zenithBank.createNewAccount("ade", "wale", "5678");
        int accountNumber = zenithBank.getAccountNumber();
        zenithBank.deposit(accountNumber, 1000);
        assertEquals(1000, zenithBank.getBalance(accountNumber, "5678"));
    }

    @Test
    public void testWithdraw() {
        MyBank zenithBank = new MyBank("Zenith");
        zenithBank.createNewAccount("ade", "wale", "9999");
        int accountNumber = zenithBank.getAccountNumber();
        zenithBank.deposit(accountNumber, 2000);
        zenithBank.withdraw(accountNumber, "9999", 500);
        assertEquals(1500, zenithBank.getBalance(accountNumber, "9999"));
    }

    @Test
    public void testTransferWithinSameBank() {
        MyBank zenithBank = new MyBank("Zenith");
        zenithBank.createNewAccount("ade", "wale", "2222");
        zenithBank.createNewAccount("wale", "ade", "3333");
        int senderAccount = zenithBank.getAccountNumber();
        zenithBank.deposit(senderAccount, 1000);
        int receiverAccount = senderAccount - 1;
        zenithBank.transfer(senderAccount, receiverAccount, 500, "3333", zenithBank);
        assertEquals(500, zenithBank.getBalance(senderAccount, "3333"));
        assertEquals(500, zenithBank.getBalance(receiverAccount, "2222"));
    }

    @Test
    public void testInterBankTransfer() {
        MyBank zenithBank = new MyBank("Zenith");
        MyBank accessBank = new MyBank("Access");

        zenithBank.createNewAccount("ade", "wale", "1234");
        accessBank.createNewAccount("wale", "ade", "5678");

        zenithBank.deposit(1, 5000);
        accessBank.deposit(1, 10000);

        zenithBank.interBankTransfer(1, 1, 1000, "1234", accessBank);

        assertEquals(4000, zenithBank.getBalance(1, "1234"));
        assertEquals(11000, accessBank.getBalance(1, "5678"));
    }

    @Test
    public void testInterBankTransferInsufficientFunds() {
        MyBank zenithBank = new MyBank("Zenith");
        MyBank accessBank = new MyBank("Access");

        zenithBank.createNewAccount("ade", "wale", "1234");
        accessBank.createNewAccount("wale", "ade", "5678");

        zenithBank.deposit(1, 500);
        accessBank.deposit(1, 1000);

        assertThrows(IllegalArgumentException.class, () ->
                        zenithBank.interBankTransfer(1, 1, 1000, "1234", accessBank));
    }

    @Test
    public void testInterBankTransferInvalidPinCode() {
        MyBank zenithBank = new MyBank("Zenith");
        MyBank accessBank = new MyBank("Access");

        zenithBank.createNewAccount("ade", "wale", "1234");
        accessBank.createNewAccount("wale", "ade", "5678");

        zenithBank.deposit(1, 5000);
        accessBank.deposit(1, 10000);

        assertThrows(IllegalArgumentException.class, () ->
                        zenithBank.interBankTransfer(1, 1, 1000, "wrongPin", accessBank));
    }


    @Test
    public void testInvalidInterBankTransfer() {
        MyBank zenithBank = new MyBank("Zenith");
        MyBank accessBank = new MyBank("Access");

        zenithBank.createNewAccount("ade", "wale", "0000");
        int senderAccount = zenithBank.getAccountNumber();
        zenithBank.deposit(senderAccount, 5000);

        assertThrows(IllegalArgumentException.class, () -> {
            zenithBank.interBankTransfer(senderAccount, 999, 1000, "0000", accessBank);  // Use correct pin code here
        });
    }


    @Test
    public void testBankRegistration() {
        BankRegistry bankRegistry = new BankRegistry();
        MyBank zenithBank = new MyBank("Zenith");
        MyBank accessBank = new MyBank("Access");
        bankRegistry.registerBank(zenithBank);
        bankRegistry.registerBank(accessBank);
        assertEquals(2, bankRegistry.displayRegisteredBanks().size());
    }

    @Test
    public void testGetBank() {
        BankRegistry bankRegistry = new BankRegistry();
        MyBank zenithBank = new MyBank("Zenith");
        bankRegistry.registerBank(zenithBank);
        assertEquals("Zenith", bankRegistry.getBank("Zenith").getBankName());
    }

    @Test
    public void testDuplicateBankRegistrationThrowsError() {
        BankRegistry bankRegistry = new BankRegistry();
        MyBank zenithBank = new MyBank("Zenith");
        bankRegistry.registerBank(zenithBank);
        assertThrows(IllegalArgumentException.class, () -> bankRegistry.registerBank(new MyBank("Zenith")));
    }

    @Test
    public void testUnregisteredBankThrowsError() {
        BankRegistry bankRegistry = new BankRegistry();
        assertThrows(IllegalArgumentException.class, () -> bankRegistry.getBank("Unknown Bank"));
    }
}
