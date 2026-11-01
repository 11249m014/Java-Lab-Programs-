class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order Placement: Order received...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order Placement: Order confirmed!");
    }
}

class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order Delivery: Preparing food...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Order Delivery: Food delivered!");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        OrderPlacement t1 = new OrderPlacement();
        OrderDelivery t2 = new OrderDelivery();

        System.out.println("=== Food Delivery Simulation ===");
        t1.start();
        t2.start();
    }
}
