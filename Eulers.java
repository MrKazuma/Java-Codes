import java.util.*;
public class Eulers 
{
   public static void main(String args[]) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int a = 1, count = 0;
        for (a = 1; a < num; a++) 
        {
            if (gcd(a, num) == 1)
            {
                count++;
            }
        }
        System.out.print(count);
        
        sc.close();
    }
    public static int gcd(int a, int b)
    {
        if (a == 0) 
        {
            return b;
        } 
        else 
        {
            return gcd(b % a, a);
        }
    }     
}

