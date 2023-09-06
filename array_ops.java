import java.util.*;
public class array_ops
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        System.out.println("Enter the elements of Matrix A:");
        for(int i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            b[i]=a[9-i];
        }
        for(int i=0;i<10;i++)
        {
            c[i]=a[i]+b[i];
        }
        System.out.println();
        System.out.println("Array A:");
        System.out.print("{");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print("}");
        System.out.println();
        System.out.println("Array B:");
        System.out.print("{");
        for(int i=0;i<10;i++)
        {
            System.out.print(b[i]+",");
        }
        System.out.print("}");
        System.out.println();
        System.out.println("Array C:");
        System.out.print("{");
        for(int i=0;i<10;i++)
        {
            System.out.print(c[i]+",");
        }
        System.out.print("}");
        System.out.println();
        in.close();
    }
}
