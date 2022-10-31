import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");

        // get user name input
        name = input.next();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");

        Random theNumber = new Random();
        int correctNumber = theNumber.nextInt(100);
        int turns = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Take a guess.");

        int guess;
        int i = 0;
        boolean win =false;
        while (win==false) {
            guess = scan.nextInt();
            turns++;

            if(guess == correctNumber) {
                win=true;
            }
            else if (guess<correctNumber) {
                i++;
                System.out.println("Your guess is lower than the number");
                return;
            }
            else if (guess>correctNumber) {
                i++;
                System.out.println("Your guess is higher than the number");
                return;
            }
            System.out.println("Good job, " + name + "! You guessed my number in " + turns + " guess/es!");
        }
//        do {
//            int theNumber = (int) (Math.random() * 100 + 1);
//            while (numberGuess != theNumber) {
//                System.out.println("Hello! What is your name?");
//
//                numberGuess = scan.nextInt();
//
//                if (numberGuess < theNumber)
//                    System.out.println(numberGuess + " is too low. Take a guess.");
//                else if (numberGuess > theNumber)
//                    System.out.println(numberGuess + " is too high. Take a guess.");
//                else System.out.println("you win");
//            }
//        }
    }
}