import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,f="";
        char c;
        int l;
        System.out.println("Enter a word:");
        s=in.nextLine();
        l=s.length();
        System.out.println("LENGTH:"+l);
        while(l>0)
        {
            c=s.charAt(l-1);
            f=f+c;
            l--;
        }
        System.out.println("Reverse: "+f);
        if(f.equalsIgnoreCase(s)==true)
        {
            System.out.println("Palindrome Word!");
        }
        else
        {
            System.out.println("Not a Palindrome Word!");
        }
        in.close();
    }
}
