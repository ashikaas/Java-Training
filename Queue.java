import java.util.ArrayList;

class Queue {
    ArrayList<Integer> q = new ArrayList<>();

    void enqueue(int x) {
        q.add(x);
    }

    int dequeue() {
        return q.remove(0);
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
}
