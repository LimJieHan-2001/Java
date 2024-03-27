public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    
    // Method to display account information
    public void displayInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
    
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.00);
        
        // Performing deposits and withdrawals
        myAccount.deposit(500.00);
        myAccount.withdraw(200.00);
        
        // Displaying account information
        myAccount.displayInfo();
    }
}
}
