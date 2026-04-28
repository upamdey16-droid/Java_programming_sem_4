interface Bank {
    void deposit(double amt);
    void withdraw(double amt);
}

class Customer {
    String name;
}

class Account extends Customer implements Bank {
    double balance = 0;

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

public class Bank_Interface {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1000);
        a.withdraw(200);
        a.display();
    }
}