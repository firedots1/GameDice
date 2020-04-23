import java.util.Random;
import java.util.Scanner;

public class GameDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Import scanner
        Random NumDiceRoll = new Random(); // Import Random
        Random NumDiceRoll2 = new Random(); // Import Random
        int die1;
        int die2;
        int TotalScore = die1 + die2;
        String ans = "yes";
        System.out.println("Welcome to a Game of Dice!");
        do {
            die1 = 1 + NumDiceRoll.nextInt(6);
            die2 = 1 + NumDiceRoll2.nextInt(6);
            TotalScore = TotalScore + +die1 + die2;
            System.out.println("Your Rolls " + die1 + " & " + die2);
            System.out.println("Your Score: " + TotalScore);
            System.out.println("Roll again (Y/N) ? ");
            ans = input.nextLine();
        }
        while (!ans.equals("no"));
        if (TotalScore <= 99) {
            System.out.println("Your Rolls " + die1 + " & " + die2);
            System.out.println("Your Score: " + TotalScore);
            System.out.println("Roll again (Y/N) ? ");
            ans = input.nextLine();
        } else if (TotalScore >= 100)
            System.out.println("You have scored over 100\n" + "Thank you for playing!");
        else if (die1 == 1 && die2 == 1)
        do
            {
            TotalScore = TotalScore + 25;
            System.out.println("Your Rolls " + die1 + " & " + die2);
            System.out.println("Your Score: " + TotalScore);
            System.out.println("Roll again (Y/N) ? ");
            ans = input.nextLine();
                else {
                System.out.println("You have Quit the Game");
            }
            }
        }
    }
}