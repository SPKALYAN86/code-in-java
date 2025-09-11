import java.util.*;
class GCD
{
    int calculategcd(int a , int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%temp;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the number 2:");
        int n2 = scan.nextInt();
        GCD gy = new GCD();
        int result = gy.calculategcd(n1,n2);
        System.out.println("the number is"+" "+result);
    }
}