import java.util.*;
class Palindromenumber
{
    long checkpalindrome(int n)
    {
        long rev = 0;
        long digit;
        int sign= (n<0) ? -1 : 1;
        while(n>0)
        {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return sign * rev;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n  = scan.nextInt();
        Palindromenumber pl = new Palindromenumber();
        long palindrome = pl.checkpalindrome(n);
        if(palindrome == n)
        {
          System.out.println("This is palindrome number:"+palindrome);
        }
        else
        {
            System.out.println("This is not a palindrome number:"+palindrome);
        }
    }
}