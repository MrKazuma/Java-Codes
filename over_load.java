

public class over_load
{
    static int a,b,s;
    public static void sum()
    {
        a=0;
        b=0;
        s=a+b;
        System.out.println("Sum= "+s);
        System.out.println();
    }
    public static void sum(int x,int y)
    {
        a=x;
        b=y;
        s=a+b;
        System.out.println("Sum= "+s);
    }
    public static void main(String args[])
    {
        sum();
        sum(10,20);
    }
}
