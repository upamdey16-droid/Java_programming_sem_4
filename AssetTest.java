abstract class Asset {
    String descriptor;
    String date;
    double currentValue;

    Asset(String descriptor, String date, double currentValue) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    int numShares;
    double sharePrice;

    Stock(String descriptor, String date, double currentValue,
          int numShares, double sharePrice) {
        super(descriptor, date, currentValue);
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    void displayDetails() {
        System.out.println("\n--- Stock Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Number of Shares: " + numShares);
        System.out.println("Share Price: " + sharePrice);
    }
}

class Bond extends Asset {
    double interestRate;

    Bond(String descriptor, String date, double currentValue,
         double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("\n--- Bond Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}

class Savings extends Asset {
    double interestRate;

    Savings(String descriptor, String date, double currentValue,
            double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("\n--- Savings Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class AssetTest {
    public static void main(String[] args) {

        Asset a;

        a = new Stock("Tech Stock", "01-01-2026", 50000, 10, 5000);
        a.displayDetails();

        a = new Bond("Government Bond", "05-02-2026", 30000, 7.5);
        a.displayDetails();

        a = new Savings("Bank Savings", "10-03-2026", 20000, 4.5);
        a.displayDetails();
    }
}