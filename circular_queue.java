
import java.util.*;
public class circular_queue
{
    static int a[]=new int[10];
    static int front=-1,rear=-1;
    static void queue(int p)
    {
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            a[rear]=p;
        }
        else if((rear+1)%10==front)
        {
            System.out.println("Queue full!");
            System.out.println("Please delete something or terminate the program.");
        }
        else
        {
            rear=(rear+1)%10;
            a[rear]=p;
        }
    }
    static void dequeue()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else if(front==rear)
        {
            System.out.println("The deleted element:"+a[front]);
            a[front]=0;
            front=-1;
            rear=-1;
        }
        else
        {
            System.out.println("The deleted element:"+a[front]);
            a[front]=0;
            front=(front+1)%10;
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
        circular_queue ob=new circular_queue();
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
                    circular_queue.queue(e);
                    break;
                case 2:
                    circular_queue.dequeue();
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
            in.close();
        }
    }
}


