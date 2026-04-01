import java.util.Scanner;
public class ReverseNumber 
{
    int num;
    ReverseNumber(int n)
    {
        num=n;
    }
    void Reverse()
    {
        int temp=num;
        int rev=0;
        while(temp!=0)
        {
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        System.out.println("Reversed Number:"+rev);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        ReverseNumber obj=new ReverseNumber(number);
        obj.Reverse();    
    }    
}
