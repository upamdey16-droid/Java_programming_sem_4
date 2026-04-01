import java.util.Scanner;
public class CheckLeapYear 
{
     int year;
     CheckLeapYear(int y)
     {
        year=y;
     }
     void CheckLeapYear()
     {
        if((year%400==0)||(year%4==0 && year%100!=0))
        {
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int y=sc.nextInt();
        CheckLeapYear obj=new CheckLeapYear(y);
        obj.CheckLeapYear();
     }
}

