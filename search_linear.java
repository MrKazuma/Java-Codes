
import java.util.*;
public class search_linear
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int rn[]=new int[48];
        int se,c=0,r=1;
        for(int i=0;i<48;i++)
        {
            rn[i]=r;
            r++;
        }
        System.out.println();
        System.out.println("Enter the roll number to be searched:");
        se=in.nextInt();
        System.out.println();
        System.out.println();
        for(int i=0;i<48;i++)
        {
            if(rn[i]==se)
                c++;
        }
        if(c!=0)
        {
            System.out.println("Search Successful !");
            System.out.println("Element found: "+se);
        }
        else
        {
            System.out.println("Roll Number not found !");
        }
        in.close();
    }
}
