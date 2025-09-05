import java.util.*;
class Sumofdigits
{ 
    public void digitssum(long n)
    {
        long lastnumber;
        long sum=0;
        while(n>0)
        {
            lastnumber = n%10;
            n=n/10;
            sum = sum + lastnumber;
        }
        System.out.println("Sum of the digits is:"+sum);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        long n = scan.nextLong();
        Sumofdigits su = new Sumofdigits();
        su.digitssum(n);
    }
}