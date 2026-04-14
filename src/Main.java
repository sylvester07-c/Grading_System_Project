import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Favour");
//        student.addGrade(73.5);
//        student.addGrade(85.5);
//        student.addGrade(80.5);
//        student.addGrade(78.3);
        System.out.println(student.getAverage());
        student.getHighest();
        student.getLowest();
        student.getName();

        ArrayList<Student> students = new ArrayList<>(){};

        GradeManager gradeManager = new GradeManager(students);

        Student student0 = new Student(6, "Grace");
        student0.addGrade(85.8);
        student0.addGrade(75.8);
        student0.addGrade(65.8);
        student0.addGrade(75.8);
        student0.addGrade(95.8);
        student0.addGrade(35.8);
        student0.addGrade(65.8);
        student0.addGrade(55.8);
        student0.addGrade(75.8);
        student0.addGrade(45.8);

        Student student01 = new Student(8, "Peace");
        student01.addGrade(65.8);
        student01.addGrade(65.8);
        student01.addGrade(65.8);
        student01.addGrade(65.8);
        student01.addGrade(15.8);
        student01.addGrade(25.8);
        student01.addGrade(85.8);
        student01.addGrade(65.8);
        student01.addGrade(45.8);
        student01.addGrade(95.8);
        Student student02 = new Student(7, "Fathia");
        student02.addGrade(15.6);
        student02.addGrade(25.5);
        student02.addGrade(65.4);
        student02.addGrade(35.8);
        student02.addGrade(45.2);
        student02.addGrade(95.5);
        student02.addGrade(25.3);
        student02.addGrade(54.4);
        student02.addGrade(56.5);
        student02.addGrade(95.0);
//        gradeManager.addStudent(1, "Favour");
//        gradeManager.addStudent(2, "Praise");
//        gradeManager.addStudent(3, "Funsho");
//
        gradeManager.addStudent(student0);
        gradeManager.addStudent(student01);
        gradeManager.addStudent(student02);
//
//
//
//
//        System.out.println(gradeManager.getStudents().toString());
//
//        gradeManager.removeStudent(student02);
//        System.out.println(gradeManager.getStudents().toString());
//        gradeManager.findByName("GRace");
        gradeManager.findById(7);
        gradeManager.printLeaderBoard();






    }
}