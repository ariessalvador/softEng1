package StatePattern_Lab1;

public class Account implements AccountState{
    private AccountState accountState;
    private double balance;
    private String accountNumber;
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    // Methods
    public void deposit(double amount) {
        accountState.deposit(amount);
    }
    public void withdraw(double amount) {
        accountState.withdraw(amount);
    }
    public void suspend() {
        accountState.suspend();
    }
    public void activate() {
        accountState.activate();
    }
    public void close() {
        accountState.close();
    }
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

}