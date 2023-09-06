import java.util.*;
class bintree_ops
{
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    Node root;
    bintree_ops()
    {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }

    Node insertKey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);

        return root;
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    boolean search(int key) {
        root = search_Recursive(root, key);
        if (root != null)
            return true;
        else
            return false;
    }
    Node search_Recursive(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key > key)
            return search_Recursive(root.left, key);
        return search_Recursive(root.right, key);
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        bintree_ops tree = new bintree_ops();
        int i,d,s,c;
        boolean b=true;
        while(b==true)
        {
            System.out.println("Enter 1 for inserting key, 2 for deleting key, 3 for searching key and 4 for Termination:");
            c = in.nextInt();
            switch (c)
            {
                case 1:
                    System.out.println("Enter the key to be inserted:");
                    i = in.nextInt();
                    tree.insert(i);
                    break;
                case 2:
                    System.out.println("Enter the key to be element:");
                    d=in.nextInt();
                    tree.deleteKey(d);
                    break;
                case 3:
                    System.out.println("Enter the element to be searched");
                    s=in.nextInt();
                    System.out.println("The result of the search:"+tree.search(s));
                    break;
                case 4:
                    System.out.println("TERMINATED !");
                    b=false;
                    break;
                default:
                    System.out.println("Wrong Choice.");
                    in.close();
            }
        }
    }
}