abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*b + b*h + h*l);
    }

    double volume() {
        return l * b * h;
    }
}
class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    double wholeSurfaceArea() {
        return 6 * a * a;
    }

    double volume() {
        return a * a * a;
    }
}


class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}


class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h);
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (1.0/3) * Math.PI * r * r * h;
    }
}

public class TestThreeDobject {
    public static void main(String[] args) {
        ThreeDObject obj;

        obj = new Box(2, 3, 4);
        System.out.println("Box Area: " + obj.wholeSurfaceArea());
        System.out.println("Box Volume: " + obj.volume());

        obj = new Cube(3);
        System.out.println("Cube Area: " + obj.wholeSurfaceArea());
        System.out.println("Cube Volume: " + obj.volume());

        obj = new Cylinder(2, 5);
        System.out.println("Cylinder Area: " + obj.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + obj.volume());

        obj = new Cone(2, 5);
        System.out.println("Cone Area: " + obj.wholeSurfaceArea());
        System.out.println("Cone Volume: " + obj.volume());
    }
}