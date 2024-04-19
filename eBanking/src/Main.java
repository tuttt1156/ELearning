import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountBank account1 = new AccountBank();
        AccountBank account2 = new AccountBank();
        System.out.print("Enter account 1 number: ");
        String account1Number = scanner.nextLine();
        account1.setAccountNumber(account1Number);
        System.out.print("Enter account 1 holder name: ");
        String account1HolderName = scanner.nextLine();
        account1.setAccountHolderName(account1HolderName);
        System.out.print("Enter initial balance for " + account1.getAccountHolderName() + ": ");
        double account1Balance = scanner.nextDouble();
        account1.setBalance(account1Balance);
        scanner.nextLine();
        System.out.print("Enter account 2 number: ");
        String account2Number = scanner.nextLine();
        account2.setAccountNumber(account2Number);
        System.out.print("Enter account 2 holder name: ");
        String account2HolderName = scanner.nextLine();
        account2.setAccountHolderName(account2HolderName);
        System.out.print("Enter initial balance for " + account2.getAccountHolderName()+ ": ");
        double account2Balance = scanner.nextDouble();
        account2.setBalance(account2Balance);
        scanner.nextLine();
        System.out.println("nInitial Account Information:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.print("Enter amount to deposit into account: " + account1.getAccountHolderName() + ", number: " +
                account1.getAccountNumber() + ": ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);
        System.out.print("Enter amount to withdraw from " + account1.getAccountHolderName() + ", number: " +
                account1.getAccountNumber() +": ");
        double withdrawAmount = scanner.nextDouble();
        if (account1.withdraw(withdrawAmount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
        System.out.print("Enter amount to transfer from " + account1.getAccountHolderName() + " to "
                + account2.getAccountHolderName() + ": ");
        double transferAmount = scanner.nextDouble();
        if (account1.transfer(account2, transferAmount)) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed.");
        }
        System.out.println("Updated Account Information:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        scanner.close();
    }
}