import java.util.*;
class Primeandnonprimecheck
{
    public void check(double n)
    {
        int flag = 0;
        double sqroot = Math.sqrt(n);
        for(int i=2; i<=sqroot;i++)
        {
            if(n%i==0)
            {
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is non prime");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        double n = scan.nextDouble();
        Primeandnonprimecheck pc = new Primeandnonprimecheck();
        pc.check(n);
    }
}