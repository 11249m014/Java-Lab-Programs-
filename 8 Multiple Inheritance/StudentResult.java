public class StudentResult implements Sports, Academics {
    String name;
    int sportsScore;
    int academicScore;

    StudentResult(String name, int sportsScore, int academicScore) {
        this.name = name;
        this.sportsScore = sportsScore;
        this.academicScore = academicScore;
    }

    public void showSportsScore() {
        System.out.println("Sports Score   : " + sportsScore);
    }

    public void showAcademicScore() {
        System.out.println("Academic Score : " + academicScore);
    }

    void display() {
        System.out.println("Student Name   : " + name);
        showSportsScore();
        showAcademicScore();
        System.out.println("Total Score    : " + (sportsScore + academicScore));
    }

    public static void main(String[] args) {
        StudentResult s = new StudentResult("Karan", 80, 90);
        System.out.println("=== Multiple Inheritance Demo ===");
        s.display();
    }
}
