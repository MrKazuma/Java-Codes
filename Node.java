/*
package com.java.programs;

//class Node{
    static String data;
    public Node prev;
    public Node next;
    public Node head,tail;

     Node(String d) {
         data=d;
         head = null;
         tail = null;
    }

    public void addNewNodeInBegin(String data)
    {
        //Creating node
        Node newNode = new Node(data);

        //Checking whether the list is empty or not
        if(head == null)
        {

            head = newNode;
            tail = newNode;

            head.prev = null;

            tail.next = null;
        }

        else {

            head.prev = newNode;

            newNode.next = head;

            newNode.prev = null;

            head = newNode;
        }
    }
    void deleteNode(Node del)
    {



        if (head == null || del == null) {
            return;
        }


        if (head == del) {
            head = del.next;
        }


        if (del.next != null) {
            del.next.prev = del.prev;
        }


        if (del.prev != null) {
            del.prev.next = del.next;
        }


        return;
    }


    public void showData() {
        Node current = head;

        if(head == null) {

            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list: ");

        while(current != null) {

            System.out.print(current.data + "\n");
            current = current.next;
        }
    }

    public static void main(String args[])
    {

        Node obj = new Node(data);
        obj.addNewNodeInBegin("Kazuma");
        obj.showData();
        System.out.println();
        System.out.println("After Addition:");
        obj.addNewNodeInBegin("Zoro");
        obj.showData();
        System.out.println();
        System.out.println("After deletion:");
        obj.deleteNode(obj.head);
        obj.showData();
    }
}
*/
