import java.util.*;
 class Calculator
{
   int a;
   int b;
   public Calculator(int i,int j)
   {
     this.a = i;
     this.b = j;
   }

    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Choose the operation you want to perform using this program");
        System.out.println("Enter num1:");
        int i = sc.nextInt();
         System.out.println("Enter any operator(+,-,/,*,%)");
         char operator = sc.next().charAt(0);
        System.out.println("Enter num2:");
        int j = sc.nextInt();
        Calculator obj = new Calculator(i,j);
        if(operator == '+')
        {
          int c = i+j;
          System.out.println("the number is"+" "+ c);
        }
        else if(operator == '-')
        {
          int c=i-j;
          System.out.println("the number is"+" "+ c);
        }
        else if(operator == '*')
        {
          int c= i*j;
          System.out.println("the number is"+" "+ c);
        }
        else if(operator == '/')
        {
          if(j!=0)
          {
            int c= i/j;
            System.out.println("the number is"+" "+ c);
          }
          else
          {
            System.out.println("ERROR");
          }
        }
        else if (operator == '%') 
        {
           if(j != 0)
           {
             int c = i % j;
             System.out.println("the number is " +" "+ c);
           }
          else 
          {
             System.out.println("ERROR: Modulo by zero");
          }
        }

       else
       {
         System.out.println("oh Sorry Invalid operator");
       }
    }
}