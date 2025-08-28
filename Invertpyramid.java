import java.util.*;
class Invertpyramid
{
   public void invert(int n)
   {
      for(int i=n;i>=1;i--)
      {
         for(int j =1;j<=n-i;j++)
         {
            System.out.print(" ");
         }
         for(int k =1;k<=2*i-1;k++)
         {
            System.out.print("*");
         }
         System.out.println(" ");
      }
   }
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int n;
      System.out.println("Enter the number:");
      n = scan.nextInt();
      Invertpyramid in = new Invertpyramid();
      in.invert(n);
      
      
   }
}
