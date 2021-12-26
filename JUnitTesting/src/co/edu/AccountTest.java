package co.edu;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	public AccountTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testAcctNo() throws InsufficientFundsException {
        Account instance = new Account();
        int id = 0;
        int number = instance.getAcctNo();
        assertEquals(id, number);       
    }

    @Test
    public void testBalance() throws InsufficientFundsException {
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);

    }

    @Test(expected=InsufficientFundsException.class)
    public void testWithdraw() throws InsufficientFundsException {
        int amount = 1;
        Account instance = new Account ();
        instance.withdraw(amount);
        int balance = instance.getBalance();
        assertEquals(-amount, balance);
    }

    @Test
    public void testDeposit() throws InsufficientFundsException {
        int amount = 0;
        Account instance = new Account ();
        instance.deposit(amount);
        int balance = instance.getBalance();
        assertEquals(amount, balance);
    }
}
