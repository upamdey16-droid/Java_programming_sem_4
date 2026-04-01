public class RectangleArea_and_Perimeter{
    double length,width;
    void calculate()
    {
        double area=length*width;
        double perimeter=2*(length+width);
        System.out.println("Area="+area);
        System.out.println("Perimeter="+perimeter);
    }
    public static void main(String[] args) {
        RectangleArea_and_Perimeter obj=new RectangleArea_and_Perimeter();
        obj.length=10;
        obj.width=5;
        obj.calculate();
    }
}