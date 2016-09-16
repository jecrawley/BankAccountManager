package crawley.james.BankAccountManager;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 9/15/16.
 */
public class BankAccountManagerTest {

    CheckingAccount checking = new CheckingAccount();
    SavingsAccount savings = new SavingsAccount();
    BusinessAccount business = new BusinessAccount();

    @Test
    public void testDebit () {

        checking.credit(100);
        checking.debit(50);

        assertEquals("The balance on the account should be $50.", 50, checking.getBalance(), 0);

    }

    @Test
    public void testSavingInterest () {

        assertEquals("The interest rate should be 5%", 0.05, savings.getInterest(), 0);

    }

    @Test
    public void testCheckingInterest () {

        assertEquals("The interest rate should be 2%", 0.02, checking.getInterest(), 0);

    }

    @Test
    public void testBusinessInterest () {

        assertEquals("The interest rate should be 8%", 0.08, business.getInterest(), 0);

    }


}
