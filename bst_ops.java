import java.util.*;
class Node
{

    int d;
    Node left, right;

    Node(int data)
    {
        d = data;
        left = null;
        right = null;
    }
}
class bst_ops
{
    static Node root;
    void Print(Node node, int k1, int k2)
    {
        if (node == null)
        {
            return;
        }
        if (k1<node.d)
        {
            Print(node.left, k1, k2);
        }
        if (k1<=node.d && k2>=node.d)
        {
            System.out.print(node.d + " ");
        }
        Print(node.right, k1, k2);
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        bst_ops tree = new bst_ops();
        int k1,k2,e1,e2,e3,e4,e5;
        System.out.println("Enter the root element:");
        e1=in.nextInt();
        tree.root = new Node(e1);
        System.out.println("Enter the next element:");
        e2=in.nextInt();
        tree.root.left = new Node(e2);
        System.out.println("Enter the next element:");
        e3=in.nextInt();
        tree.root.right = new Node(e3);
        System.out.println("Enter the next element:");
        e4=in.nextInt();
        tree.root.left.left = new Node(e4);
        System.out.println("Enter the next element:");
        e5=in.nextInt();
        tree.root.left.right = new Node(e5);
        System.out.println();
        System.out.println("Enter the value of k1:");
        k1=in.nextInt();
        System.out.println("Enter the value of k2:");
        k2=in.nextInt();
        if(k1<k2)
        {
            tree.Print(root, k1, k2);
        }
        else
        {
            System.out.println("Wrong input for k1 and k2 values!");
        }
    }
}