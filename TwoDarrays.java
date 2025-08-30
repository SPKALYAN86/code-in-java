import java.util.*;
class TwoDarrays
{
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sizefor row:");
        int size1 = scan.nextInt();
        System.out.println("Enter the sizefor coloumn:");
        int size2 = scan.nextInt();
        int[][] numbers = new int[size1][size2];
        for(int i=0;i<size1;i++)
        {
            for(int j=0; j<size2; j++)
            {
                numbers[i][j] = scan.nextInt();
            }
        }
        int x = scan.nextInt();
       for(int i=0; i<size1;i++)
       {
            for(int j=0; j<size2; j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.println("x found at location("+i+","+j+")");
                }

                
            }
       }
    }
}