abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    Accounts(int accNo, String name, String address, double balance) {
        this.accountNumber = accNo;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int accNo, String name, String address, double balance, double roi) {
        super(accNo, name, address, balance);
        this.rateOfInterest = roi;
    }

    void withdrawal(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        System.out.println("Interest: " + interest);
    }
}

public class Accounts_and_Savings_Account {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Upam", "Kolkata", 5000, 5);

        s.deposit(1000);
        s.withdrawal(500);
        s.display();
        s.calculateAmount();
    }
}