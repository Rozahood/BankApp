import java.awt.*;
import java.util.ArrayList;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}