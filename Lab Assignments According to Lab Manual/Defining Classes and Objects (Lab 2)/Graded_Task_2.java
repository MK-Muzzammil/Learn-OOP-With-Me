class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to deposit balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

    public class Graded_Task_2{
        // Example usage
    public static void main(String[] args) {
        Account account1 = new Account();  // Create an account object with default balance of 0.0
        account1.deposit(100.0);  // Deposit $100.0
        System.out.println("Current balance: $" + account1.getBalance());  // Print current balance
        account1.withdraw(50.0);  // Withdraw $50.0
        System.out.println("Current balance: $" + account1.getBalance());  // Print current balance

        Account account2 = new Account(500.0);  // Create an account object with initial balance of $500.0
        System.out.println("Current balance: $" + account2.getBalance());  // Print current balance
    }
    
}

    

