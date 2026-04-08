import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        
        String result = str.replace('d', 'f');

        
        System.out.println("Modified string: " + result);

    }
}