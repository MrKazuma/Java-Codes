
import java.util.*;
public class matrix_diag_add
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[3][3];
        int s=0,f=0;
        System.out.println("Enter the elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println();
        System.out.println("The Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i!=j)
                    s=s+a[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i>j && a[i][j]==0)
                    f++;
            }
        }
        System.out.println();
        System.out.println("Sum of the above and below diagonal elements: "+s);
        if(f>=3)
            System.out.println("Upper triangular Matrix.");
        else
            System.out.println("Not an Upper Triangular Matrix.");

            in.close();
    }
}
