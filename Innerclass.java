class outerclass{
    int number=10;
    void show()
    {
        System.out.println("This is outerclass");
        System.out.println("Value of number: "+number);
    }
}
class inner extends outerclass{
    void display()
    {
        System.out.println("This is child class inheriting outerclass");
    }
}
public class Innerclass {
    public static void main(String[] args) {
        inner child=new inner();
        child.show();
        child.display();
    }
}
