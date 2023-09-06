import java.util.*;
public class maxprod
{
    static int prod(int a[])
    {
        int p=1;
        for(int i=0;i<a.length;i++)
        {
            p=p*a[i];
        }
        return p;
    }
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int n,pr=0;
        System.out.println("Enter the length of the array:");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)////work is still left
        {
            pr=prod(a);
        }
        System.out.println("Product= "+pr);
        in.close();
    }
}
