package crawley.james.BankAccountManager;

/**
 * Created by jamescrawley on 9/15/16.
 */
public class BankAccountManager {

    public static void main (String[] args) {

        ATM atm = new ATM();

        System.out.println("Creating an account.");
        atm.createAccount("checking");
        System.out.println("Crediting account for $10");
        atm.getAccount(0).credit(10);
        System.out.println("The balance on the account is: " + atm.getAccount(0).getBalance());
        System.out.println("The interest for the account is: " + atm.getAccount(0).getInterest());
        System.out.println("Debiting account for $10.");
        atm.getAccount(0).debit(10);
        System.out.println("Checking account balance.");
        System.out.println("The balance on the account is: " + atm.getAccount(0).getBalance());
        System.out.println("Deleting account.");
        atm.deleteAccount(0);
        System.out.println(atm.getAccount(0));

    }
}
