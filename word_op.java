
import java.util.*;
public class word_op
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String w,nw="";
        int l;
        System.out.println("Enter the word:");
        w=in.nextLine();
        l=w.length();
        char c[]=new char[l];
        for(int i=0;i<l;i++)
        {
            c[i]=w.charAt(i);
        }
        for(int i=0;i<l;i++)
        {
            if(w.indexOf(c[i])==i)
                nw=nw+c[i];
        }
        System.out.println("The original word: "+w);
        System.out.println("The new word: "+nw);
        in.close();
    }
}
