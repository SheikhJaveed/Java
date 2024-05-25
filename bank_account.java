// Class representing a simple Bank Account
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class bank_account {
    // Method to demonstrate passing objects as arguments
    public static void depositToAccount(BankAccount account, double amount) {
        account.deposit(amount);
    }

    // Method to demonstrate returning objects from methods
    public static BankAccount createAccount(String accountNumber, double initialBalance) {
        return new BankAccount(accountNumber, initialBalance);
    }

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount myAccount = createAccount("123456", 1000.0);

        // Depositing to the account
        depositToAccount(myAccount, 500.0);

        // Getting balance
        System.out.println("Current balance: " + myAccount.getBalance());

        // Withdrawing from the account
        myAccount.withdraw(200.0);

        // Getting balance after withdrawal
        System.out.println("Current balance: " + myAccount.getBalance());
    }
}
