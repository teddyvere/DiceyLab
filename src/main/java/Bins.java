public class Bins {
    private int[] frequencies;


    public Bins(int maxSum) {
        frequencies = new int[maxSum - 1]; // Adjust for 0-based array
    }

    public void updateFrequency(int sum) {
        frequencies[sum - 2]++; // Adjust for 0-based array and starting sum at 2
    }

    public void printResults() {
        System.out.println("\nNumber\tFrequency\tPercentage");
        System.out.println("-------\t---------\t--------");
        for (int sum = 2; sum <= frequencies.length + 1; sum++) {
            double total = 1;
            System.out.println(sum + "\t\t" + frequencies[sum - 2] +  "\t\t\t" + (((total += frequencies[sum -2])-1)/((frequencies.length))));
        }
    }
}
