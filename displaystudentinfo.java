import java.util.*;
class rollnumber
{
    Scanner sc = new Scanner(System.in);
    int[]roll = new int[6];
     void displayroll()
    {
        for(int i=0; i<6; i++)
        {
           System.out.println("Enter the roll number:");
           roll[i]= sc.nextInt();
        }
        for(int i=0; i<6; i++)
        {
            System.out.println("THE roll number is:"+roll[i]);
        }
    }
}
class studentname
{
    Scanner sc = new Scanner(System.in);
    String[]name = new String[6];
    void displayname()
    {
        for(int j=0; j<6; j++)
        {
            System.out.println("Enter the name:");
            name[j]=sc.nextLine();
        }
        for(int j=0; j<6;j++)
        {
            System.out.println("The name"+" "+j+"is:"+name[j]);
        }
    }
    

}
 class displaystudentinfo
{
    public static void main(String[] args)
    {
        rollnumber obj1 = new rollnumber();
        obj1.displayroll();
        studentname obj2 = new studentname();
        obj2.displayname();
    }
}