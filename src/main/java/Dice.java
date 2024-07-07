import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int numSides;

    public Dice(int numSides) {
        this.numSides = numSides;
    }

    public int roll() {
        if (numSides <= 0) {
            throw new IllegalArgumentException("Number of sides must be positive");
        }
        return (int) (Math.random() * numSides) + 1;
    }
}
