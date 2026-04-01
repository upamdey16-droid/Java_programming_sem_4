import java.util.Scanner;
public class FibonacciSeries 
{
    int n;
    FibonacciSeries(int num)
    {
        n=num;
    }
    void printSeries()
    {
        int a=0,b=1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i <= n; i++) 
        {
            System.out.println(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms=sc.nextInt();
        FibonacciSeries obj=new FibonacciSeries(terms);
        obj.printSeries();    
    }
}
