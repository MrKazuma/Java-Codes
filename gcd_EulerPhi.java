import java.util.*;
class gcd_EulerPhi
{
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int phi(int n)
    {
        int result = 1;
        for (int i = 2; i < n; i++)
            if (gcd(i, n) == 1)
                result++;
        return result;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value:");
        n=in.nextInt(); 
        System.out.println();
        for (int i= 1; i <= n; i++)
            System.out.println("gcd(" + i + ") = " + phi(i));
            in.close();
    }
}