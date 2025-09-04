import java.util.*;
class Factorial
{
    public long  calculatefactorial(int n)
    {
        long factorial =1;
    
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
        
            for(int i=1;i<=n;i++)
             {
               factorial = factorial *i;
        
             }
             
            return factorial;
        }
    }
     public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        Factorial fc = new Factorial();
        long  result = fc.calculatefactorial(n);
        System.out.println("The factorial of this number:"+" "+result);
     }   
}