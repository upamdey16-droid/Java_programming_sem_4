interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String client, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale done: " + amount);
    }

    public void generateInvoice(String client, double amount) {
        System.out.println("Invoice for " + client + " Amount: " + amount);
    }

    void showSummary() {
        System.out.println("All operations completed.");
    }
}

public class Commercial_Work_System {
    public static void main(String[] args) {
        CommercialExecutive ce = new CommercialExecutive();
        ce.processSale(5000);
        ce.generateInvoice("ABC Ltd", 5000);
        ce.showSummary();
    }
}