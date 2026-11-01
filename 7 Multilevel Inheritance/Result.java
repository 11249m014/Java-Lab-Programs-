public class Result extends Marks {
    int total;
    double average;
    char grade;

    void calculate() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void showResult() {
        showStudent();
        showMarks();
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.setStudent(101, "Ananya");
        r.setMarks(85, 90, 78, 88, 92);
        r.calculate();

        System.out.println("=== Student Result ===");
        r.showResult();
    }
}
