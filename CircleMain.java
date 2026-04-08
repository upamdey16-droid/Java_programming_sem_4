class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    double radius;
    Point center;  

    Circle(double radius, int x, int y) {
        this.radius = radius;
        center = new Point(x, y); 
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayCircle() {
        System.out.println("Radius: " + radius);
        center.displayPoint();
        System.out.println("Area of Circle: " + calculateArea());
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0, 3, 4);
        c1.displayCircle();
    }
}