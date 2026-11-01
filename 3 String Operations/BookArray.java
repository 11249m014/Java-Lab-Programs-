import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[10];

        System.out.println("Enter 10 book titles:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("\nBooks starting with letter 'A':");
        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (books[i].toUpperCase().startsWith("A")) {
                System.out.println(books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found starting with 'A'.");
        }

        sc.close();
    }
}
