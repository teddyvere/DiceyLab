public class DiceRoller {
    private Dice die1;
    private Dice die2;

    public DiceRoller(int numSides) {
        die1 = new Dice(numSides);
        die2 = new Dice(numSides);
    }

    public int roll() {
        return die1.roll() + die2.roll();
    }
}