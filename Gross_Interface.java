import java.util.Scanner;

interface Gross {
    double calculateGross();
}

class Employee {
    private double basic;

    // Constructor
    Employee(double basic) {
        this.basic = basic;
    }

    // Getter
    double getBasic() {
        return basic;
    }
}

class Salary extends Employee implements Gross {
    private double da;   // Dearness Allowance
    private double hra;  // House Rent Allowance

    // Constructor
    Salary(double basic, double da, double hra) {
        super(basic);
        this.da = da;
        this.hra = hra;
    }

    // Implement interface method
    public double calculateGross() {
        return getBasic() + da + hra;
    }

    void display() {
        System.out.println("\n------ Salary Details ------");
        System.out.println("Basic Salary: " + getBasic());
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class Gross_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        Salary s = new Salary(basic, da, hra);
        s.display();
    }
}