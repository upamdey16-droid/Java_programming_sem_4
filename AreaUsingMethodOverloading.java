class AreaUsingMethodOverloading {

    // Area of square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Area of rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of circle
    void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        AreaUsingMethodOverloading obj = new AreaUsingMethodOverloading();

        obj.area(5);          // Square
        obj.area(4, 6);       // Rectangle
        obj.area(3.5);        // Circle
    }
}