import java.util.*;
class Recursion
{
    long  factorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }

    }
    
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number:");
       int n = scan.nextInt();
       Recursion re = new Recursion();
       long result = re.factorial(n);
       System.out.println("The Factorial of this number is:"+result);

    }
}