public class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int empId, String name, double basicSalary, double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    double calculateGross() {
        return basicSalary + hra + da;
    }

    void displayDetails() {
        display();
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + calculateGross());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        PermanentEmployee e1 = new PermanentEmployee(1, "Amit", 30000, 5000, 3000);
        PermanentEmployee e2 = new PermanentEmployee(2, "Sneha", 40000, 6000, 4000);

        System.out.println("=== Permanent Employee Details ===");
        e1.displayDetails();
        e2.displayDetails();
    }
}
