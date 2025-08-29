import java.util.*;
class Inverttriangle
{
    public void inverttriangle(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
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
        Inverttriangle ob1 = new Inverttriangle();
        ob1.inverttriangle(n);
    }
}