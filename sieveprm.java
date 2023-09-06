import java.util.*;
public class sieveprm 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        boolean prm[]=new boolean[n];
        Arrays.fill(prm,true);
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
        System.out.println("The prime number list:");//printing t/f array
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            System.out.println(prm[i]);
            else
            System.out.print(prm[i]+" , ");

        }
        in.close();
    }
    
}
