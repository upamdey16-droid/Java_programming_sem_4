import java.util.Scanner;
public class MaximumOfThreeNumbers 
{
    int a,b,c;
    MaximumOfThreeNumbers(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void findMax()
    {
        int max;
        if(a>=b && a>=c)
        {
            max=a;
        }
        else if (b>=a && b>=c) 
        {
            max=b;    
        }
        else
        {
            max=c;
        }
        System.out.println("Maximum number is: "+max);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter third number: ");
        int num3=sc.nextInt();
        MaximumOfThreeNumbers obj=new MaximumOfThreeNumbers(num1,num2,num3);
        obj.findMax();
    }    
}
