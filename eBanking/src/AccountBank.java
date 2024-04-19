public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public AccountBank() {
        this.accountNumber = "0000";
        this.accountHolderName = "Van Quyen";
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.printf("Balance: %.2f\n", balance);
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient money or invalid amount.");
            return false;
        }
    }

    public boolean transfer(AccountBank destinationAccount, double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Transferred: " + amount + " to " + destinationAccount.getAccountNumber());
            return true;
        } else {
            System.out.println("Insufficient money or invalid amount.");
            return false;
        }
    }
}

