// Bank.java
public class Bank {
    private double balance;

    public Bank() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Successfully withdrawn");
        } else {
            System.out.println("Incorrect amount!");
        }
    }
}

// Driver.java
public class Driver {
    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println("Initial Balance: " + b.getBalance());
        b.deposit(1000);
        System.out.println("Balance after deposit: " + b.getBalance());

        b.withdraw(500);
        System.out.println("Balance after withdrawal: " + b.getBalance());
    }
}
