
import java.util.*;
public class nums
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,neg=0,pos=0;
        System.out.println("Enter the number of elements:");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
                pos++;
            if(a[i]<0)
                neg++;
        }
        System.out.println("Total number of elements: "+n);
        System.out.println("No. of positive numbers: "+pos);
        System.out.println("No. of negative numbers: "+neg);
        in.close();
    }
}
