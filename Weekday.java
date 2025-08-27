import java.util.*;
class Weekday
{
    public void wichWeekday(int day)
    {
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saterday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }
    }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int day;
    System.out.println("Enter the number of day:");
    day = scan.nextInt();
    Weekday d1 = new Weekday();
    d1.wichWeekday(day);
    
  }
}