import java.util.*;
public class bubble_sort
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        char c[]=new char[20];
        char t;
        System.out.println("Enter the characters:");
        for(int i=0;i<20;i++)
        {
            c[i]=in.next().charAt(0);
        }
        for(int i=0;i<19;i++)
        {
            for(int j=0;j<20-i-1;j++)
            {
                if(c[j+1]>c[j])
                {
                    t=c[j];
                    c[j]=c[j+1];
                    c[j+1]=t;
                }
            }
        }
        System.out.println("Elements after sorting:");
        for(int i=0;i<20;i++)
        {
            System.out.print(c[i]+" , ");
        }
        in.close();
    }
}
