public class Fibonacci {
    int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int number = 10; 
        int result = f.fibonacci(number);
        System.out.println("Fibonacci of " + number + " is: " + result);
    }
}
