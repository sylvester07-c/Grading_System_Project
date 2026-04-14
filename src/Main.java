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

        double[] myGrade01 = {65.8,
                65.8,
                65.8,
                65.8,
                15.8,
                25.8,
                85.8,
                65.8,
                45.8,
                95.8};
        student01.addGrade(myGrade01);








        Student student02 = new Student(7, "Fathia");
        double[] myGrade02 = {15.6,25.5,65.4,35.8,45.2,95.5,25.3,54.5,67.8,90.5};
        student02.addGrade(myGrade02);

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