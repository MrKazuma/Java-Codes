
import java.util.*;
public class happynumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int  n;
        System.out.println("Enter a number: ");
        n=in.nextInt();
        int s=0,r;
        boolean b=true;
        while(b==true)
        {
            while(n>0)
            {
                r=n%10;
                s=s+(r*r);
                n=n/10;
            }
            n=s;
            s=0;
            if(n==1)
                b=false;
        }
        if(b==false)
        {
            System.out.println("Happy Number !!");
        } 
        else
        {
            System.out.println("Not a Happy Number !!");
        }
        in.close();
            
        

    }
}
