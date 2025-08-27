import java.util.*;
class Pyramidstructure
{
    public void printstructure(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++)
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
        System.out.println("Enter the number of stars:");
        n = scan.nextInt();
        Pyramidstructure p1 = new Pyramidstructure();
        p1.printstructure(n);
        
    }
}