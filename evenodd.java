
import java.util.Scanner;


public class evenodd{
    public static void main(String []args)
    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter any number to check even or odd=");
        int n = sc.nextInt();
        if (n%2==0)
        {
            System.out.println(n+"even number");
        }
        else 
        {
            System.out.println(n+"odd number");
        }
        sc.close();
    }
}