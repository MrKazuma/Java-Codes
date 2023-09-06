
import java.util.*;
public class series
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
        int m,n,sum;
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        System.out.println("Enter the value of m:");
        m=in.nextInt();
        sum=((fact(n)*fact(m))/((fact(m-n))*fact(n)));
        System.out.println("Sum= "+sum);
        in.close();
    }
}
