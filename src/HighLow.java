import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int max = 100;
        int rand = (int) (Math.random() * max + 1);
        int guess;
        int guesses = 0;
        do {
            guess = getUserGuess(1, max);
            guesses++;
            if (guesses >= 10) {
                System.out.printf("You ran out of guesses! The number was %d" +
                        ".%n", rand);
                return;
            }
            if (guess < rand) {
                System.out.printf("HIGHER! You have %d guesses left.%n",
                        10 - guesses);
            } else if (guess > rand) {
                System.out.printf("LOWER! You have %d guesses left.%n",
                        10 - guesses);
            }
        } while (guess != rand);
        System.out.printf("GOOD GUESS! That took you %d guesses.%n", guesses);
    }

    private static int getUserGuess(int min, int max) {
        Scanner s = new Scanner(System.in);
        int number;
        do {
            System.out.printf("Guess the number between %d and %d, numbers " +
                    "only please: ", min, max);
            while (!s.hasNextInt()) {
                System.out.printf("That was not a valid input!%n");
                s.next();
            }
            number = s.nextInt();
            if (number < min || number > max) {
                System.out.println("That number is out of range!");
            }
        } while (number < min || number > max);
        return number;
    }
}
