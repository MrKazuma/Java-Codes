
import java.util.*;
public class reverse_num
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,rev=0,r;
        System.out.println("Enter a number: ");
        num=in.nextInt();
        while(num!=0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("The number after reversing is: "+rev);
        in.close();
    }
}
