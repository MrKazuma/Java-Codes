
import java.util.*;
public class stackopers
{
    static int top=-1;
    static int a[]=new int[10];
    void push(int p)
    {
        if(top==9)
        {
            System.out.println("Stack full!");
            System.out.println("Please delete something or terminate the program.");
        }
        else
        {
            a[++top]=p;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Empty!");
        }
        else
        {
            System.out.println("Removed element:"+a[top]);
            a[top--]=0;
        }
    }
    void display()
    {
        System.out.println("The Stack:");
        for(int i=0;i<top+1;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        stackopers ob=new stackopers();
        int e,c;
        boolean b=true;
        while(b==true)
        {
            System.out.println("Enter 1 for Push Operation, 2 for Pop Operation, 3 for Display and 4 for Termination:");
            c=in.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter the element:");
                    e=in.nextInt();
                    ob.push(e);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.display();
                    break;
                case 4:
                    System.out.println("TERMINATED !");
                    b=false;
                    break;
                default:
                    System.out.println("Wrong Choice.");
            }
        }
        in.close();
    }
}
