import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cave;
        Scanner input = new Scanner(System.in);
        System.out.println("You are in a land full of dragons.\n" +
                "The dragons all live in caves with their large piles of collected treasure.\n" +
                "Some dragons are friendly and share their treasure.\n" +
                "Other dragons are hungry and eat anyone who enters their cave.\n" +
                "You approach two caves, one with a friendly dragon and the other with a hungry dragon.\n" +
                "Which of the two caves do you choose? (1 or 2)" );

        // pick cave 1 or 2 and outcome for each
        cave = input.nextInt();
        switch (cave) {
            case 1: System.out.println("You approach the cave... \n" +
                    "It is dark and spooky... \n" +
                    "A large dragon jumps out in front of you! He opens his jaws and... \n" +
                    "Gobbles you down in one bite!");
            break;
            case 2: System.out.println("You approach the cave... \n" +
                    "It is dark and spooky... \n" +
                    "A large dragon approaches you! \n" +
                    "The dragon is friendly and decides to share their treasure with you!");
            break;
            default: System.out.println("Please choose a valid cave to enter (1 or 2)");
            break;
        }
    }
}