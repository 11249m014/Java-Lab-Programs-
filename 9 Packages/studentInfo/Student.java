package studentInfo;

public class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayInfo() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}
