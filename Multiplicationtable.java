import java.util.*;
class Multiplicationtable
{
    public void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        Multiplicationtable mu = new Multiplicationtable();
        mu.table(n);
        
    } 
}