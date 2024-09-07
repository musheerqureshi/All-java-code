package LinkedList;

import javax.print.attribute.standard.SheetCollate;

public class basicsll {

    public static void display(Node head){
        Node temp = head;  // head == a; and tail == e;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Question for recursion
    public static void displayrecursivly(Node head){
        if (head == null) return;
        System.out.print(head.data + " ");
        displayrecursivly(head.next);
    }

    public static void  displayrecursivelyReverse(Node head){
        if (head == null) return;
        displayrecursivelyReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static class Node{
        int data;
        Node next;

        // constructor
        Node(int data){
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(13);
        Node d = new Node(11);
        Node e = new Node(55);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);


        // question for recursion
        System.out.println();
        displayrecursivly(a);

        System.out.println();
        displayrecursivelyReverse(a);

    }
}
