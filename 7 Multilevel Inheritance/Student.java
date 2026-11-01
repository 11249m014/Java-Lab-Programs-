public class Student {
    int rollNo;
    String name;

    void setStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void showStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}
