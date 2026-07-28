class BankAccount {
    String holderName;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String name, int acc, double bal) {
        holderName = name;
        accountNumber = acc;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Show balance method
    void showBalance() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Puja", 100447, 10000);
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.showBalance();
    }
}
