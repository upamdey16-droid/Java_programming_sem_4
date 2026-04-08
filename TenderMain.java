import java.util.Scanner;
class Tender{
    String company;
    double cost;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter company name:");
        company=sc.next();
        System.out.println("Enter cost:");
        cost=sc.nextDouble();
    }
}
public class TenderMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tender[] t =new Tender[5];
        for(int i=0;i<5;i++)
        {
            t[i]=new Tender();
            System.out.println("\nEnter details for Tender"+(i+1));
            t[i].input();
        }
        double min=t[0].cost;
        String minCompany=t[0].company;
        for(int i=1;i<5;i++)
        {
            if(t[i].cost<min){
                min=t[i].cost;
                minCompany=t[i].company;
            }
        }
        System.out.println("\nCompany with the minimum cost: "+minCompany);
        System.out.println("Minimum Cost: "+min);
    }
}