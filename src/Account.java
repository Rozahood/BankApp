public class Account {
    private String accountNumber;
    private String accountName;
    private int BVM;
    private double balance;

    public Account(String accountNumber, String accountName, int BVM, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.BVM = BVM;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBVM() {
        return BVM;
    }

    public void setBVM(int BVM) {
        this.BVM = BVM;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}