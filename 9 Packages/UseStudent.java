import studentInfo.Student;

public class UseStudent {
    public static void main(String[] args) {
        Student s = new Student("Meera", 55);
        System.out.println("=== Using Package studentInfo ===");
        s.displayInfo();
    }
}
