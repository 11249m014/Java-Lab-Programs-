import java.util.Scanner;

public class AgeExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            String input = sc.nextLine();
            int age = Integer.parseInt(input);
            System.out.println("Age entered: " + age);

            System.out.print("Enter a number to divide 100 by age: ");
            int divisor = sc.nextInt();
            int result = 100 / divisor;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age!");
            System.out.println("Exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception: " + e);
        }

        System.out.println("Program ended safely.");
        sc.close();
    }
}
