import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Student {

    protected int  studentID;
    protected String name;
    protected double[] grades;
    protected int gradeCount;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.grades = new double[10];
        this.gradeCount = gradeCount;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        if(gradeCount < grades.length){
                grades[gradeCount] = grade;
                gradeCount++;

        }else {
            System.out.println("Grade list is full!");
        }

    }

    public int getGradeCount() {
        return gradeCount;
    }

    public void addGrade(double[] newgrade) {
        for(int i = 0; i < newgrade.length; i++){
            if(gradeCount < grades.length){
                grades[gradeCount] = newgrade[i];
                gradeCount++;
            }else{
                System.out.println("List full!");
                break;
            }
        }

    }

    public double getAverage() {
        double sum = 0;
        double average = 0;
        if(gradeCount == 0) {
            System.out.println("No grade has been entered!");
        }else {
            for (double grade : grades) {
                sum += grade;
                average = sum / gradeCount;
            }

//            System.out.println("Grade average is :" + average);
        }
        return Math.round(average * 100.0) / 100.0;
    }

    public  double getHighest(){
        double highest = grades[0];
        for(int i = 0; i < gradeCount; i++ ){
            if(grades[i] > highest){
                highest = grades[i];
            }
        }
        System.out.println("Your highest grades is: " + highest);
        return  highest;
    }

    public double getLowest() {
        if(gradeCount == 0){
            System.out.println("No grades added yet.");
            return  0;
        }

        double lowest = grades[0];
        for(int i = 0; i < gradeCount; i++) {
            if(grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        System.out.println("Your lowest grades is: " + lowest);
        return  lowest;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", gradeCount=" + gradeCount +
                '}';
    }
}
