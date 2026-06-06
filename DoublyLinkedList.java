public class DoublyLinkedList {

    Node head;

    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    
    void insertStart(int val) {
        Node newNode = new Node(val);

        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    
    void insertEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertBetween(int afterVal, int val) {
        Node temp = head;

        while (temp != null && temp.val != afterVal) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found");
            return;
        }

        Node newNode = new Node(val);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertStart(20);
        dll.insertStart(10);

        dll.insertEnd(30);
        dll.insertEnd(40);

        dll.insertBetween(20, 25);

        dll.display();
    }
}
    