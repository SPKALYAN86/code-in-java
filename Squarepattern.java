import java.util.*;
class Squarepattern
{
    public void square(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<n;j++)
            {
               if(i==0||i==n-1||j==0||j==n-1)
               {
                    System.out.print("*");
               }
               else
               {
                    System.out.print(" ");
               }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n = scan.nextInt();
        Squarepattern star = new Squarepattern();
        star.square(n);
    }
}