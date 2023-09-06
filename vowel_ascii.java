
import java.util.*;
public class vowel_ascii
{
    static int vow(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return 1;
        else
            return 0;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,ns="",ts;
        int l,t;
        System.out.println("Enter a sentence:");
        s=in.nextLine();
        l=s.length();
        char c[]=new char[l];
        for(int i=0;i<l;i++)
        {
            c[i]=s.charAt(i);
        }
        for(int i=0;i<l;i++)
        {
            if(vow(c[i])==1)
            {
                t=(int)c[i];
                ts=Integer.toString(t);
                ns=ns.concat(ts);
            }
            else
            {
                ns=ns+c[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Original Sentence: "+s);
        System.out.println("New Sentence: "+ns);
        in.close();
    }
}
