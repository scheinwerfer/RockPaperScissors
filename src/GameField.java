import javax.xml.bind.DatatypeConverter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameField {

    static List<String> options = new ArrayList<>();

    public GameField() {
        initGame();
    }

    public void initGame() {
        System.out.print("Enter your move: ");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        switch (choice) {
            case ("0"):
                System.out.println("exit");
                break;
            case ("?"):
                System.out.println("need help");
                break;
            default:
                System.out.print("Your move: " + playerMove(Integer.parseInt(choice)));
                System.out.println("\nComputer move: " + computerMove());
                System.out.println("win!");
                break;
        }
    }

    public String playerMove(int move) {
        return options.get(move - 1);
    }

    public String computerMove() {
        SecureRandom random = new SecureRandom();
        int move = random.nextInt(options.size());
        return options.get(move);
    }

    public void createKey() {
        SecureRandom random = new SecureRandom();
        byte[] seed = random.generateSeed(16);
        System.out.println(DatatypeConverter.printHexBinary(seed));
    }

    public static void main(String[] args) {
        if (args.length <3) {
            System.out.println("the arguments entered are incorrect.\nExample: rock paper scissors lizard spock (at least three)");
        } else {
            System.out.println("Available moves:");
            for (int i = 0; i < args.length; i++) {
                options.add(i, args[i]);
                System.out.println((i + 1) + " - " + args[i]);
            }
            System.out.println("0 - exit\n? - help");
        }
        new GameField();
    }
}