public class Factorial 
{
    int Factorial(int n)
    {
        int fact=1;
        for (int i = 1; i<= n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) 
    {
        Factorial obj = new Factorial();
        int number=5;
        int result=obj.Factorial(number);
        System.out.println("Factorial of "+number+" is: "+result);
    }    
}
