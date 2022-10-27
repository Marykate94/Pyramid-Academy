import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Hello! What is your name?");

        // get user name input
        name = nameInput.next();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20. \n" +
                "Take a guess.");
    }
}