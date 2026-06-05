class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class InsertionLinkedList {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.next = n3;

        Node startNode = new Node(5);
        startNode.next = head;
        head = startNode;

        Node middleNode = new Node(15);
        middleNode.next = head.next.next;
        head.next.next = middleNode;

        Node endNode = new Node(40);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = endNode;

        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

        
        
