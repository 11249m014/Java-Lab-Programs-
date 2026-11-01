public class TrainCodes {
    public static void main(String[] args) {
        String[] trainCodes = {"EXP101", "LOC202", "SUP303"};

        System.out.println("Available train codes:");
        for (int i = 0; i < trainCodes.length; i++) {
            System.out.println(i + " -> " + trainCodes[i]);
        }

        try {
            System.out.println("\nAccessing index 5...");
            System.out.println("Train Code: " + trainCodes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train index!");
            System.out.println("Exception: " + e);
        }

        System.out.println("Program continues normally...");
    }
}
