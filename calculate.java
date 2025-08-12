import java.util.Scanner;

public class calculate{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter number 1");
        int n1= obj.nextInt();
        System.out.println("enter number 2");
        int n2= obj.nextInt();
        System.out.println("enter choice 1 to 5");
        int c=obj.nextInt();
        switch(c) {
            case 1:
            int sum=(n1+n2);
            System.out.println("ADDITION IS:"+sum);
                break;
                 case 2:
            float sub=(n1-n2);
            System.out.println("sub IS:"+sub);
                break;
                 case 3:
            int mul=(n1*n2);
            System.out.println("mul IS:"+mul);
                break;
                 case 5:
            int div=(n1/n2);
            System.out.println("div IS:"+div);
                break;
            default:
                System.out.println("invalid number");
        }
    }
}