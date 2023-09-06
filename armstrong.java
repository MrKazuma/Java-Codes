
import java.util.*;
public class armstrong
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=in.nextInt();
        int r,s=0,p;
        p=n;
        while(n>0)
        {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(s==p)
            System.out.println("Armstrong!");
        else
            System.out.println("Not a Armstrong");
            in.close();
    }
}
