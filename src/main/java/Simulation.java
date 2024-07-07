import java.util.Scanner;

public class Simulation {


    public static <DiceStatistics> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to roll the dice: ");
        int numRolls = scanner.nextInt();

        DiceRoller roller =new  DiceRoller(6);
        Bins stats = new Bins(12); // Max sum is 12 (2 dice)

        // Simulate dice rolls
        for (int i = 0; i < numRolls; i++) {
            int sum = roller.roll();
            stats.updateFrequency(sum);
        }

        stats.printResults();
        scanner.close();
    }
}
