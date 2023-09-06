import java.util.*;
public class sieveprm2 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        primes(n);
        sc.close();
    }
    static void primes(int n)//printing numbers
    {
        boolean prm[]=new boolean[n];
        Arrays.fill(prm,true);
        int c=0;
                for(int i=2;i<n;i++)
        {
            if(prm[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                    prm[j]=false;
                }
            }
        }
        System.out.println();
        //System.out.println();
        for(int i=2;i<n;i++)
        {
            if(prm[i])
            {
                System.out.print(i+",");
            }
            c++;
            if(c%10==0)
            {
                System.out.println();
            }
        }
    }
}
