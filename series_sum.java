
import java.util.*;
public class series_sum
{
    static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a;
        double s=0;
        System.out.println("Enter the value of a:");
        a=in.nextInt();
        System.out.println("Enter the no. of terms needed:");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                s=s+(a/fact(i));
            }
        }
        System.out.println("The Sum is: "+s);
        in.close();
    }
}
