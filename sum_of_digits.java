import java.util.*;
public class sum_of_digits 
{
    static int count(int num)
    {
        int c=0;
        while(num>0)
        {
            c++;
            num=num/10;            
        }
        return c;
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int n,s=0,r;
        System.out.println("Enter the number:");
        n=in.nextInt();
        while(true)
        {
            while(n>0)
            {
                r=n%10;
                s=s+r;
                n=n/10;
            }
            if(count(s)>1)
            n=s;
            if(count(n)==1)
            break;
        }        
        //System.out.println("The number:"+);
        System.out.println("The sum of its digits:"+s);
        in.close();
    }
    
}
