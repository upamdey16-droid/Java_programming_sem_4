class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {

    // Overriding method
    void display() {
        super.display(); // calling parent class method
        System.out.println("This is a car");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}