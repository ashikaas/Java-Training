import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> stack = new ArrayList<>();

    void push(int x) {
        stack.add(x);
    }

    void pop() {
        System.out.println(stack.remove(stack.size() - 1));
    }

    void peek() {
        System.out.println(stack.get(stack.size() - 1));
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek(); 
        s.pop();  
        s.peek(); 
    }
}