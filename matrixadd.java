
import java.util.*;
public class matrixadd
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the rows for the matrix:");
        m=in.nextInt();
        System.out.println("Enter the columns for the matrix:");
        n=in.nextInt();
        int a[][]=new int [m][n];
        int b[][]=new int [m][n];
        int r[][]=new int [m][n];
        System.out.println("Enter the elements for the first matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the elements for the second matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        System.out.println();
        System.out.println("First Matrix:--");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Second Matrix:--");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                r[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The resultant matrix:--");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
