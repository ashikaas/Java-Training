public class Factorial {
        int factorial(int n) {
        if (n <= 0) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int number = 5; 
        int result = f.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
