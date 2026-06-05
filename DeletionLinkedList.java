class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeletionLinkedList {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Start 
        head = head.next;

        // Middle 
        head.next = head.next.next;

        // End
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        
        temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}