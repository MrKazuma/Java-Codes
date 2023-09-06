import java.util.*;
public class majorityelements //frequnecy of elements in a array
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array:");
        n=in.nextInt();
        System.out.println();
        int a[]=new int[n];
        //int b[]=new int[n];
        int c[]=new int[n];
        System.out.println("Enter the elements for the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c[i]++;
                }
                
            }
        }//Printing the frequency along with the elements.

        
        // System.out.println("Element             Frequency");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(a[i]+"                       "+c[i]);
        // }
        in.close();
    }    
}
