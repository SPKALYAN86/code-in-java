import java.util.*;
class Reversenumber
{   
    
     int  reversenumber(int n)
    {
        int rev = 0;
        int digit;
        int sign = (n<0) ? -1 : 1;
        n = n*sign;
        while(n>0)
        {
            digit = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return rev * sign;

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        Reversenumber r1 = new Reversenumber();
        int result = r1.reversenumber(n);
        System.out.println("The reversed number is:"+result);
        
    }
}