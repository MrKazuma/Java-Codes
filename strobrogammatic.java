import java.util.*;
public class strobrogammatic 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int n,p,r,s=0;
        System.out.println("Enter the number");
        n=in.nextInt();
        p=n;
        while(n!=0)//mapping respectively
        {
            r=n%10;
            if(r==6)
            {
                s=s*10+9;
            }
            else if(r==9)
            {
                s=s*10+6;
            }
            else if(r==1)
            {
                s=s*10+r;
            }
            else if(r==8)
            {
                s=s*10+r;
            }
            else if(r==0)
            {
                s=s*10+r;
            }
            else
            {
                n=n/10;
                continue;
            }
            //System.out.println(r);
            n=n/10;
        }
        if(p==s)
        System.out.println("Strobrogrammatic Number.");
        else
        System.out.println("Not a Strobrogrammatic number.");
        in.close();
    }
}