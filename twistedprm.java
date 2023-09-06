import java.util.*;
public class twistedprm
{
    static int prm(int n)
    {
        int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                f=f+1;
        }
        if(f==2)
            return 1;
        else
            return 0;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,r,rev=0;
        System.out.println("Enter a number:");
        n=in.nextInt();
        if(prm(n)==1)
        {
            while(n>0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            if(prm(rev)==1)
                System.out.println("TWISTED PRIME");
            else
                System.out.println("Not a TWISTED PRIME");
        }
        else
            System.out.println("Not a Prime Number");

            in.close();
    }
}
