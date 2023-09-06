import java.util.*;
public class leap_year
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int y;
        System.out.println("Enter the year:");
        y=in.nextInt();
        if(y%100==0)
        {
            if(y%400==0)
            System.out.println("Leap Year!");
            else
            System.out.println("Not a Leap Year!");
        }
        else if(y%4==0)
        {
            System.out.println("Leap Year!");
        }
        else
        {
            System.out.println("Not a Leap Year!");
        }
        in.close();

    }
    
}