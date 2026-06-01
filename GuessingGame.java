import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = 25; // Secret number
        int guess = 0;

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > target) {
                System.out.println("Too High!");
            } 
            else if (guess < target) {
                System.out.println("Too Low!");
            } 
            else {
                System.out.println("Congratulations! You guessed the number!");
            }
        }

        sc.close();
    }
}