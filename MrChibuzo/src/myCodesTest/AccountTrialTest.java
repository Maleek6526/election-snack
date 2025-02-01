package myCodesTest;

import myCodes.AccountTrial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTrialTest {
    @Test
    public void testThatThe5hCanBeDepositedAndBalanceWillBe5h() {
        AccountTrial account = new AccountTrial();
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    public void testThatMoneycanBeDepositedTwice() {
        AccountTrial account = new AccountTrial();
        account.deposit(500);
        account.deposit(500);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testThatNegativeAmountCannotBeDepositedAndTheBalanceRemainSame() {
        AccountTrial account = new AccountTrial();
        account.deposit(500);
        account.deposit(500);
        account.deposit(-1000);
        assertEquals(1000, account.getBalance());

    }

    @Test
    public void testThatMoneyCanBeWithdrawnAndTheAccountWillBeDeducted() {
        AccountTrial account = new AccountTrial();
        account.deposit(500);
        account.deposit(500);
        account.getWithdrawer(500);
        assertEquals(500, account.getBalance());

    }

    @Test
    public void testThatNegativeAmountWontAffectTheBalance() {
        AccountTrial account = new AccountTrial();
        account.deposit(500);
        account.deposit(500);
        account.getWithdrawer(-500);
        assertEquals(1000, account.getBalance());

    }

    @Test
    public void testThatAUserCannotWithdrawMoreThanTheirBalance() {
        AccountTrial account = new AccountTrial();
        account.deposit(500);
        account.deposit(500);
        account.getWithdrawer(1500);
        assertEquals(1000, account.getBalance());

    }

    @Test
    public void testThatAUserCannotWithdrawMoreThanTheirBalances() {
        AccountTrial account = new AccountTrial();
        account.deposit(500);
        account.deposit(500);
        account.getWithdrawer(500);
        assertEquals(500, account.getBalance());

    }

    @Test
    public void testThatWHenIHaveZeroAccountICantWithdraw() {
        AccountTrial account = new AccountTrial();
        account.getWithdrawer(500);
        assertEquals(0, account.getBalance());

    }


}