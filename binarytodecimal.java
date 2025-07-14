import java.util.*;
class binarytodecimal{
    static void convertodecimal(long b)
    {
        int decimalnumber = 0;
        int i=0;
        int remainder;
        while(b!=0)
        {
           remainder = (int)(b % 10);
           decimalnumber = decimalnumber + remainder *(int)Math.pow(2,i);
           b = b/10;
           i++;
        }
        System.out.println("Decimal number is:"+decimalnumber);
    }
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number:");
        long b = sc.nextLong();
        binarytodecimal.convertodecimal(b);

    }
}