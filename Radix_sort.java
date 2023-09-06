

import java.util.*;
class Radix_sort
{
    static int getnum(int a[], int n)//largest number of the array
    {
        int max = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
    static void c_sort(int a[], int n, int d)//count sort of the array
    {
        int a2[] = new int[n];// d represents the digits
        int i;
        int c[] = new int[10];
        Arrays.fill(c, 0);
        for (i = 0; i < n; i++)
            c[(a[i] / d) % 10]++;
        for (i = 1; i < 10; i++)
            c[i] += c[i - 1];
        for (i = n - 1; i >= 0; i--) {
            a2[c[(a[i] / d) % 10] - 1] = a[i];
            c[(a[i] / d) % 10]--;
        }
        for (i = 0; i < n; i++)
            a[i] = a2[i];
    }
    static void rad_sort(int a[], int n)//radix sort
    {
        int m = getnum(a, n);
        for (int d = 1; m / d > 0; d *= 10)
            c_sort(a, n, d);
    }
    static void disparray(int a[], int n)//displaying the new array
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        rad_sort(a, n);
        System.out.println();
        System.out.println("Sorted Array:");
        disparray(a,n);
        in.close();
    }
}
