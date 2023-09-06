
import java.util.*;
public class integerpalindrome
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,p;
        int rev=0,r;
        System.out.println("Enter a number: ");
        n=in.nextInt();
        p=n;
        while(n>0)
        {
            r=n%10;
            //System.out.println(r);
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse: "+rev);
        if(p==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
            in.close();
    }
}
