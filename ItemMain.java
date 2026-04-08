import java.util.Scanner;
class Item{
    int code;
    double price;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter item code: ");
        code=sc.nextInt();
        System.out.println("Enter item price: ");
        price=sc.nextDouble();
    }
    void display()
    {
        System.out.println(code+"\t\t"+price);
    }
}
public class ItemMain
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Item[] items=new Item[5];
        double total=0;
        for (int i = 0; i < 5; i++) 
        {
            items[i]=new Item();
            System.out.println("\nEnter details for item "+(i+1));
            items[i].input();
        }
        System.out.println("\nCode\t\tPrice");
        System.out.println("----------------------");
        for (int i=0;i<5;i++) {
            items[i].display();
            total+=items[i].price;
        }
        System.out.println("-----------------------");
        System.out.println("Total price = "+total);
    }
}