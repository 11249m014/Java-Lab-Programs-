class Payment implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing... (" + i + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Payment Successful!");
    }
}

public class PaymentProcess {
    public static void main(String[] args) {
        System.out.println("=== Payment Gateway ===");
        Payment p = new Payment();
        Thread t = new Thread(p);
        t.start();
    }
}
