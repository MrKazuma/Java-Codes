
public class perfectnum
{
    static int divisor(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        int rem;
        System.out.println("List of Perfect Numbers:-");
        for(int i=1;i<=1000;i++)
        {
            rem=divisor(i);
            if(i==rem)
                System.out.print(i+",");
        }
    }
}
