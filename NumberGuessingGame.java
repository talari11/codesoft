import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("How many rounds would you like to play? ");
        int rounds = scanner.nextInt();

        int score = 0;

        for (int round = 1; round <= rounds; round++) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10; // Limit the number of attempts

            System.out.printf("\nRound %d: Guess the number between 1 and 100. You have %d attempts.\n", round,
                    maxAttempts);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.printf("Correct! The number was %d.\n", numberToGuess);
                    score++; // Increment score for a correct guess
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.printf("Sorry! You've used all attempts. The number was %d.\n", numberToGuess);
            }
        }

        System.out.printf("\nGame over! Your score: %d/%d\n", score, rounds);
        scanner.close();
    }
}
