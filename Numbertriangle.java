import java.util.*;
class Numbertriangle
{
    public void printpattern(int n)
    {
        for(int i =1;i<=n;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        Numbertriangle num = new Numbertriangle();
        num.printpattern(n);
    }
}