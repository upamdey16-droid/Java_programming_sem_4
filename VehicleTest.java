abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double price;

    MotorVehicle(String name, int number, double price) {
        this.modelName = name;
        this.modelNumber = number;
        this.price = price;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String name, int number, double price, double discountRate) {
        super(name, number, price);
        this.discountRate = discountRate;
    }

    double discount() {
        return price * discountRate / 100;
    }

    void display() {
        System.out.println("Car: " + modelName);
        System.out.println("Model No: " + modelNumber);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount());
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car("Honda City", 2025, 1200000, 10);
        c.display();
    }
}