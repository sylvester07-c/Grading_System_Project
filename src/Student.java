import java.util.Arrays;
import java.util.Scanner;

public class Student {

    private String studentID;
    private String name;
    protected double[] grade;
    private int gradeCount;

    public Student(String studentID, String name, double[] grade, int gradeCount) {
        this.studentID = studentID;
        this.name = name;
        this.grade = new double[10];
        this.gradeCount = gradeCount;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double[] getGrade() {
        return grade;
    }

    public int getGradeCount() {
        return gradeCount;
    }

    public static double[] addGrade(double[] grade) {
        return grade;
    }

    public double getAverage() {
        double sum = 0;
        double average = 0;
        for (double gra : grade) {
            sum += gra;
            average = sum / grade.length - 1;
        }
        return average;
    }

    public  double getHighest(){
        double highest = grade[0];
        for(int i = 0; i < grade.length; i++ ){
            if(grade[i] > highest){
                highest = grade[i];
            }
            System.out.println("Your highest grade is: " + highest);
        }
        return  highest;
    }

    public double getLowest() {
        double lowest = grade[0];
        for(int i = 0; i < grade.length; i++) {
            if(grade[i] < lowest) {
                lowest = grade[i];
            }
            System.out.println("Your lowest grade is: " + lowest);
        }
        return  lowest;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + Arrays.toString(grade) +
                ", gradeCount=" + gradeCount +
                '}';
    }
}
