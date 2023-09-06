
import java.util.*;
public class matrixmul
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,m2,n2;
        System.out.println("Enter the size of the row for the 1st matrix:-");
        m=in.nextInt();
        System.out.println("Enter the size of the column 1st matrix:-");
        n=in.nextInt();
        System.out.println("Enter the size of the row 2nd matrix:-");
        m2=in.nextInt();
        System.out.println("Enter the size of the column 2nd matrix:-");
        n2=in.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m2][n2];
        int r[][]=new int[m][n2];
        System.out.println("Enter the Elements of the  1st Matrix:-");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the Elements of the  2nd Matrix:-");
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        System.out.println();
        System.out.println("The Original Matrix 1:-");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Original Matrix 2:-");
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n2;j++)
            {
                r[i][j]=0;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n2;j++)
            {
                for(int k=0;k<m2;k++)
                {
                    r[i][j]=r[i][j]+(a[i][k]*b[k][i]);
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The Resultant Matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}