//package AccountTest;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class BankTest {
//    @Test
//    public void testThatBankWorks(){
//        Bank bank = new Bank();
//        bank.addAccount("Adewale", "Maleek", "4444");
//        assertEquals(bank.getCounter(), 1);
//    }
//
//    @Test
//    public void testThatBankAccountNumberWorks(){
//        Bank bank = new Bank();
//        bank.addAccount("Adewale", "Maleek", "4444");
//        assertEquals(bank.getAccountNumber(), 1);
//    }
//
//    @Test
//    public void findAccount(){
//        Bank bank = new Bank();
//        bank.addAccount("Adewale", "Maleek", "4444");
//        bank.addAccount("Adewale", "Ma", "1444");
//        assertEquals(bank.findAccount(1).getFullName(), "Adewale Maleek");
//        assertEquals(bank.findAccount(2).getFullName(), "Adewale Ma");
//        assertEquals(bank.findAccount(1).getPincode(), "4444");
//        assertEquals(bank.findAccount(2).getPincode(), "1444");
//    }
//
//    @Test
//    public void checkForTransfer(){
//        Bank bank = new Bank();
//        bank.addAccount("Adewale", "Maleek", "4444");
////        bank.addAccount("Adewale", "Ma", "1444");
//        bank.depositInto(bank.findAccount(1l), 100);
//        assertEquals(bank.getBalance(), 100);
//    }
//}
