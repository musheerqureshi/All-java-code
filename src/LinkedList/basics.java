package LinkedList;

public class basics {

    public static class Node{
        int data; // value
        Node next; // address of next node

        // constructor
        Node (int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(3);  // head Node
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(6);
        // 3  5  4  9  6
        a.next = b;   // 3 -> 5  4  9  6
        b.next = c;   // 3 -> 5 -> 4  9  6
        c.next = d;   // 3 -> 5 -> 4 -> 9  6
        d.next = e;   // 3 -> 5 -> 4 -> 9 -> 6

        //System.out.println(a.data);
        //System.out.println(a.next);
        //System.out.println(b.data);
        //System.out.println(c.data);
        //System.out.println(d.data);
        //System.out.println(e.data);

        // how to print all data with the help of "a"
        // first type

        //System.out.println(a.data);
        //System.out.println(a.next.data);
        //System.out.println(a.next.next.data);
        //System.out.println(a.next.next.next.data);
        //System.out.println(a.next.next.next.next.data);

        // second type

        /**
        Node temp = a;
        for (int i = 1; i <= 5; i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
         **/

        Node temp = a;
        while (temp != null){  // printing the list
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
