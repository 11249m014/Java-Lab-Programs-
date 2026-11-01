public class SalesMinMax {
    public static void main(String[] args) {
        double[] sales = {25000, 32000, 18000, 45000, 30000, 28000,
                          50000, 22000, 35000, 41000, 27000, 38000};

        double max = sales[0];
        double min = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Monthly Sales:");
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Month " + (i + 1) + ": " + sales[i]);
        }

        System.out.println("\nHighest Sales : " + max);
        System.out.println("Lowest Sales  : " + min);
    }
}
