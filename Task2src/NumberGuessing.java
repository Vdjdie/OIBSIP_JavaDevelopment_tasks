import java.util.Scanner;
import java.util.Random;

public class NumberGuessing{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        int number = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 to 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High");
            } else if (guess < number) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct! 🎉");
                System.out.println("Attempts: " + attempts);
            }
        }

        sc.close();
    }
}

