
import java.util.*;
public class primeornot
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
        int p,r,c=0;
        int pr,sum;
        int rem[]=new int[6];
        System.out.println("Enter a number:");
        p=in.nextInt();
        while(p>0)
        {
            r=p%10;
            rem[c]=r;
            c=c+1;
            p=p/10;
        }
        if(c==5)
        {
            if(prm(rem[0])==1)
            {
                if(prm(rem[4])==1)
                {
                    pr=rem[0]*rem[4];
                    System.out.println("Product: "+pr);
                }
            }
            else
            {
                sum=rem[0]+rem[4];
                System.out.println("Sum= "+sum);
            }
        }
        else
        {
            System.out.println("ERROR 5 Digits not found");
        }
        in.close();
    }
}