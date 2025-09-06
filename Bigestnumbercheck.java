import java.util.*;
class Bigestnumbercheck
{
    public void numbercheck(int a,int b,int c)
    {
        if(a>b&&a>c)
        {
            System.out.println(a+" "+"is greater of three numbers");
        }
        else if(b>a&&b>c)
        {
            System.out.println(b+" "+"is greater of three numbers");
        }
        else
        {
            System.out.println(c+" "+"is greater of three numbers");
        }
        
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the Second number:");
        int b = scan.nextInt();
        System.out.println("Enter the third number:");
        int c = scan.nextInt();
        Bigestnumbercheck bc = new Bigestnumbercheck();
        bc.numbercheck(a,b,c);
        
        
    }
}