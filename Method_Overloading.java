public class Method_Overloading{

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();

        System.out.println("Sum of 2 ints: " + obj.add(10, 20));
        System.out.println("Sum of 3 ints: " + obj.add(10, 20, 30));
        System.out.println("Sum of doubles: " + obj.add(5.5, 2.5));
    }
}