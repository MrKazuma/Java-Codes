import java.util.*;
public class weighted_sub
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ",ns="";
        // int n=01231230134;
        int k;
        // System.out.println("Enter the string:");
        // s=in.nextLine();
        System.out.println("Enter the value of K:");
        k=in.nextInt();
        for(int i=0;i<k;i++)
        {
            for(int j=i;j<s.length();j++)
            {
                char c=s.charAt(j);
                ns=ns+c;
            }           
            System.out.print(ns+" , ");
            ns=""; 
        }
        in.close();
    }
    
}
