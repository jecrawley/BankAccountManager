package crawley.james.BankAccountManager;

/**
 * Created by jamescrawley on 9/15/16.
 */
public abstract class Account {

    protected double interest;
    protected  double balance;

    protected void credit (double amount ) {

        balance += amount;

    }

    protected void debit (double amount) {

        balance -= amount;

    }

    protected double  getBalance () {

        return balance;

    }

    protected double getInterest () {

        return interest;

    }
}
