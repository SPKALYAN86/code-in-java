import java.util.*;
class Gradedetect
{
    public void studentgrade(int marks)
    {
       if(marks>=90)
       {
            System.out.println("A");
       }
       else if(marks>=70)
       {
            System.out.println("B");
       }
       else if(marks>=50)
       {
            System.out.println("C");
       }
       else if(marks>=35)
       {
            System.out.println("D");
       }
       else
        {
            System.out.println("Fail");
        }       
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the value:");
        marks = sc.nextInt();
        Gradedetect s1 = new Gradedetect();
        System.out.println("The grade is:");
        s1.studentgrade(marks);

    }
}
