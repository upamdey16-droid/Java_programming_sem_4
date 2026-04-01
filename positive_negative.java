import java.util.Scanner;
public class positive_negative 
{
    int num;
    positive_negative(int n)
    {
        num=n;
    }
    void checkNumber()
    {
        if(num>0)
        {
            System.out.println("The number is Positive.");
        }
        else if(num<0)
        {
            System.out.println("The number is Negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        positive_negative obj=new positive_negative(number);
        obj.checkNumber();
    }
}
