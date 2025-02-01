package AccountTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void test(){
        Account account = new Account("Adewale", "maleek", "1234");
        account.getDeposit(100.00);
        account.getDeposit(100.00);
        account.getDeposit(100.00);
        assertEquals(account.getBalance(), 300.00);
    }

    @Test
    public void testWithdrawer(){
        Account account = new Account("Adewale", "maleek", "1234");
        account.getDeposit(100.00);
        account.getDeposit(100.00);
        account.getDeposit(100.00);
        account.getDeposit(100.00);
        account.getWithdrawer(100.00, "1234");
        assertEquals(account.getBalance(), 300.00);
    }
}
