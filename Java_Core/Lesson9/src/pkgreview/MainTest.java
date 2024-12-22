package pkgreview;

public class MainTest {
    public static void main(String[] args) {
        Student student = new StudentCollege();
        student.name = "Devmaster";
        student.year = 10;
        student.show();
        System.out.println("============");

        student = new StudentUniversity();
        student.name = "University";
        student.year = 10;
        student.show();

        StudentCollege studentCollege = new StudentCollege("Xuân Tùng", 21, 7, 8, 9);
        studentCollege.show();
        System.out.println(studentCollege.toString());

        StudentUniversity studentUniversity = new StudentUniversity("Xuân Sơn", 22, 10, 10, 10, 10);
        studentUniversity.show();
        System.out.println(studentUniversity.toString());
    }
}
