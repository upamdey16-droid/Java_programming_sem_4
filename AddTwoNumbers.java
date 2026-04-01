public class AddTwoNumbers
{
    int a,b;
    void add()
    {
        int sum=a+b;
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        AddTwoNumbers obj=new AddTwoNumbers();
        obj.a=10;
        obj.b=20;
        obj.add();
    }

}