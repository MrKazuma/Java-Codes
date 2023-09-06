
import java.util.*;
public class diff_opsarr
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        boolean t=true;
        int c,e,p=0,s;
        System.out.println("Enter the elements:");
        for(int i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter 1 for Insertion at beginning.");
        System.out.println("Enter 2 for Insertion at end.");
        System.out.println("Enter 3 for Insertion at user entered position.");
        System.out.println("Enter 4 for Deletion from beginning.");
        System.out.println("Enter 5 for Deletion from end.");
        System.out.println("Enter 6 for Deletion from a user entered position.");
        System.out.println("Enter 7 to search an element.");
        System.out.println("Enter 8 to update any element.");
        System.out.println("Enter 9 to merge two arrays.");
        System.out.println("Enter 10 to terminate the program.");
        while(t==true)
        {
            System.out.println();
            System.out.println();
            System.out.println("Enter your Choice:");
            c=in.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    e=in.nextInt();
                    a[0]=e;
                    System.out.println("New Array:");
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a[i]);
                    }
                    break;
                case 2:
                    System.out.println("Enter the element to be inserted:");
                    e=in.nextInt();
                    a[9]=e;
                    System.out.println("New Array:");
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a[i]);
                    }
                    break;
                case 3:
                    System.out.println("Enter the element to be inserted:");
                    e=in.nextInt();
                    System.out.println("Enter the position for insertion:");
                    p=in.nextInt();
                    a[p]=e;
                    System.out.println("New Array:");
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a[i]);
                    }
                    break;
                case 4:
                    System.out.println("Deleted element: "+a[0]);
                    a[0]=0;
                    System.out.println("New Array:");
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a[i]);
                    }
                    break;
                case 5:
                    System.out.println("Deleted element: "+a[9]);
                    a[9]=0;
                    System.out.println("New Array:");
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a[i]);
                    }
                    break;
                case 6:
                    System.out.println("Enter the position for deletion:");
                    p=in.nextInt();
                    System.out.println("Deleted element: "+a[p]);
                    a[p]=0;
                    System.out.println("New Array:");
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a[i]);
                    }
                    break;
                case 7:
                    System.out.println("Enter the element to be searched:");
                    s=in.nextInt();
                    int f=0;
                    for(int i=0;i<10;i++)
                    {
                        if(s==a[i])
                        {
                            p=i+1;
                            f++;
                        }
                    }
                    if(f==1)
                        System.out.println("Element Found at position: "+p);
                    else
                        System.out.println("Not Found.");
                    break;
                case 8:
                    System.out.println("Enter the position where element needs to be updated:");
                    p=in.nextInt();
                    System.out.println("Enter the element to be updated:");
                    e=in.nextInt();
                    a[p]=e;
                    System.out.println("New Array:");
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(a[i]);
                    }
                    break;
                case 9:
                    int b[]=new int[10];
                    int x[]=new int[20];
                    System.out.println("Enter the elements:");
                    for(int i=0;i<10;i++)
                    {
                        b[i]=in.nextInt();
                    }
                    for(int i=0;i<20;i++)
                    {
                        if(i<10)
                            x[i]=a[i];
                        else
                            x[i]=b[i-10];
                    }
                    System.out.println("The new array:");
                    for(int i=0;i<20;i++)
                    {
                        System.out.println(x[i]);
                    }
                    break;
                case 10:
                    System.out.println("THANK YOU!");
                    t=false;
                    break;
                default:
                    System.out.println("Wrong Input.");
                    break;
            }
        }
        in.close();

    }

}
