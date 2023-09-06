import java.util.*;
public class strhyphen //putting hyphen at first in a string
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        String str,s1="",s2="";
        char p;
        System.out.println("Enter the string:");
        str=in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            p=str.charAt(i);
            if(p=='-')
            s1=s1+p;
            else
            s2=s2+p;
        }
        str=s1.concat(s2);
        System.out.println();
        System.out.println("The new String is:"+str);
        in.close();
    }
    
}
