import java.util.Scanner;

public class BankApp {
        public static void main(String[] args) {
            Bank bank = new Bank();

            Account account1 = new Account("123456789", "Ayoka Francis", 45678, 23,456);
            Account account2 = new Account("177400", "Moyo Dayo", 1234567,69,456);

            bank.addAccount(account1);
            bank.addAccount(account2);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter account number:");
            String accountNumber = scanner.nextLine();

            Account account = bank.getAccount(accountNumber);

            if (account != null) {
                System.out.println("Account number: " + account.getAccountNumber());
                System.out.println("Account name: " + account.getAccountName());
                System.out.println("BVM: " + account.getBVM());
                System.out.println("Balance: " + account.getBalance());
            } else {
                System.out.println("Account not found.");
            }
        }
}
