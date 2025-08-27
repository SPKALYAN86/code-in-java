import java.util.*;
class Trianglepattern
{
    public void printstar(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of star:");
        n = scan.nextInt();
        Trianglepattern tc = new Trianglepattern();
        tc.printstar(n);
    }
}