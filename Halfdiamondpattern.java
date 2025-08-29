import java.util.*;
class Halfdiamondpattern
{
    public void halfdiamond(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        Halfdiamondpattern obj2 = new Halfdiamondpattern();
        obj2.halfdiamond(n);

    }
}