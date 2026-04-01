public class Odd_or_Even 
{
    int num;
    void check()
    {
        if(num%2==0)
        {
            System.out.println(num+" is even");
        }
        else
        {
            System.out.println(num+" is odd");
        }
    }
    public static void main(String[] args) {
        Odd_or_Even obj=new Odd_or_Even();
        obj.num=7;
        obj.check();
    }    
}
