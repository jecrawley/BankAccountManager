package crawley.james.BankAccountManager;

import java.util.ArrayList;

/**
 * Created by jamescrawley on 9/15/16.
 */
public class ATM {

    private ArrayList<Account> accounts = new ArrayList();
    private CheckingAccount checking;
    private SavingsAccount savings;
    private BusinessAccount business;


    public void createAccount (String accountType) {

        switch (accountType) {

            case "checking":
                checking = new CheckingAccount();
                accounts.add(checking);
                break;
            case "savings":
                savings = new SavingsAccount();
                accounts.add(savings);
                break;
            case "business":
                business = new BusinessAccount();
                accounts.add(business);
                break;
            default :
        }

    }

    public void deleteAccount (int index) {

        accounts.remove(index);

    }

    public Account getAccount(int index) {

        try {

            return accounts.get(index);

        } catch (IndexOutOfBoundsException e) {

            return null;
        }

    }
}
