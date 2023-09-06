
import java.util.*;
public class queueops
{
    static int a[]=new int[10];
    static int front=0,rear=0;
    static void push(int p)
    {
        if(rear==9)
        {
            System.out.println("Queue full!");
            System.out.println("Please delete something or terminate the program.");
        }
        else
        {
            a[rear++]=p;
        }
    }
    static void pop()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("The deleted element:"+a[front]);
            a[front]=0;
            for(int i=0;i<rear-1;i++)
            {
                a[i]=a[i+1];
            }
            if(rear<10)
                a[rear]=0;
            rear--;
        }
    }
    void display()
    {
        System.out.println("The Queue");
        for(int i=0;i<rear;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        queueops ob=new queueops();
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
