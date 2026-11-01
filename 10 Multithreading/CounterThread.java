class Counter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Counting finished!");
    }
}

public class CounterThread {
    public static void main(String[] args) {
        System.out.println("=== Task Manager Counter ===");
        Counter c = new Counter();
        c.start();
    }
}
