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
        Student student01 = new Student(8, "Peace");
        Student student02 = new Student(7, "Fathia");

//        gradeManager.addStudent(1, "Favour");
//        gradeManager.addStudent(2, "Praise");
//        gradeManager.addStudent(3, "Funsho");

        gradeManager.addStudent(student0);
        gradeManager.addStudent(student01);
        gradeManager.addStudent(student02);




        System.out.println(gradeManager.getStudents().toString());

        gradeManager.removeStudent(student02);
//         students = gradeManager.getStudents();

        System.out.println(gradeManager.getStudents().toString());

//        System.out.println(gradeManager.toString());
//        System.out.println(gradeManager.toString());

        for(Student studentn: students){
            System.out.println(studentn);
        }

    }
}