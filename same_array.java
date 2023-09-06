import java.util.*;
public class same_array
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,6};
        int l1=a.length;
        int l2=b.length;
        int f=0;
        if(l1==l2)
        {
            for(int i=0;i<l1;i++)
            {
                if(a[i]==b[i])
                f++;
            }
            if(f==l1)
            System.out.println("The arrays are same.");
            else
            System.out.println("The arrays are not same.");
        }
        else
        {
            System.out.println("The arrays are not same.");
        }
        in.close();
    }
}