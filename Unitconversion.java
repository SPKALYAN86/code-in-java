import java.util.*;
class Unitconversion
{
   
    static double unitconvert1(double c)
    {
      
        return ((c*9/5)+32);
    }
    static double unitconvert2(double m)
    {
       
        return 3.281 * m;
    }
    static double unitconvert3(double kg)
    {
       
        return 2.205 * kg;
    }
    static double unitconvert4(double h)
    {
       
        return 3600 * h;
    }
    static double unitconvert5(double g)
    {
      
        return 3.78541 * g;
    }
public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose the Unit to be  Converted");
    System.out.println("1.Celsious to Fahrenheit");
    System.out.println("2.Meter to feet");
    System.out.println("3.Kilogram to Pounds");
    System.out.println("4.Hours to Second");
    System.out.println("5.Galons to liters");

    System.out.println("Enter a number for which unit conversion you want to perform through this programme");
    int x = scan.nextInt();

 
    switch(x)
    {
        case 1:
            System.out.println("Enter a number in celcious:");
            double c = scan.nextDouble();
            System.out.println(unitconvert1(c)+"°F");
            break;
        case 2:
            System.out.println("Enter a number in Meter:");
            double m = scan.nextDouble();
            System.out.println(unitconvert2(m)+"Feet");
            break;
        case 3:
            System.out.println("Enter a number in Kilogram");
            double kg = scan.nextDouble();
            System.out.println(unitconvert3(kg)+"lbs");
            break;
        case 4:
            System.out.println("Enter a number in Hours");
            double h = scan.nextDouble();
            System.out.println(unitconvert4(h)+"S");
            break;
        case 5:
            System.out.println("Enter a number in Gallon");
            double g = scan.nextDouble();
            System.out.println(unitconvert5(g)+"L");
            break;
    }
}
}




