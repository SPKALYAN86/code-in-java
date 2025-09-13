import java.util.*;
public class GreaterCommonDivisor
{
    int calculategcd(int a,int b)
    {
        int gcdvalue = 0;
        int min = (a<b) ? a : b;
        for(int i = 1; i<=min; i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcdvalue = i;
            }
        }
        return gcdvalue;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int n2 = scan.nextInt();
        GreaterCommonDivisor gcd = new GreaterCommonDivisor();      
        int result = gcd.calculategcd(n1,n2);
        System.out.println("This number GCD is:"+result);
        
    }
}