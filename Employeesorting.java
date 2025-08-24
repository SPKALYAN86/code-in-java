import java.util.*;
class Employee
{
    String name;
    String empID;
    double basic;
  Scanner scan = new Scanner(System.in);
   void readdetails()
   {
        System.out.println("Enter the Employee name:");
        name = scan.nextLine();
        System.out.println("Enter the EmployeeID:");
        empID = scan.nextLine();
        System.out.println("Enter the basic of the Employee:");
        basic = scan.nextDouble();
        scan.nextLine();
   }
   void displaydetails()
   {
        System.out.println("Employee name is:"+name+"Employee ID is:"+empID+"Basic is"+basic);
   }
}
public class Employeesorting
{
  public static void main(String[] args)
  {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of all employees:");
        n = scan.nextInt();
        scan.nextLine();
        Employee[]employees = new Employee[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("\nEnter details for employees:"+(i+1)+":");
            employees[i]= new Employee();
            employees[i].readdetails();

        }
        for(int i=0; i<n-1; i++)
        {
            for(int j=0;j<n-i-1; j++)
            {
                if(employees[j].basic>employees[j+1].basic)
                {
                        Employee temp = employees[j];
                        employees[j]=employees[j+1];
                        employees[j+1]=temp;
                }
            }
        }

        System.out.println("Employees are sorted by (low to high)");
        for(Employee emp:employees)
        {
            emp.displaydetails();
        }
  }
}