
import java.util.*;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=0,b=1;
        int n,c;
        System.out.println("Enter the no. of terms:");
        n=in.nextInt();
        System.out.println("The Fibonacci series is:-");
        System.out.print(a+","+b);
        for(int i=0;i<n;i++)
        {
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;

        }
        in.close();
    }
}
