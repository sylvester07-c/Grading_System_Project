import java.util.ArrayList;

public class GradeManager{

    ArrayList<Student> students;
    ArrayList<String> activityLog;

    public GradeManager(ArrayList<Student> students){
        this.students = new ArrayList<Student>();
        this.activityLog = new ArrayList<String>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(int studentId, String name) {
         Student newStudent = new Student(studentId, name);
         students.add(newStudent);
         activityLog.add("Added student: " + name);
         System.out.println("Student " + name + " added successfully!");

        }

        public void addStudent(Student student){
        students.add(student);
        activityLog.add("Added student: " + student.name);
        System.out.println("Student " + student.name + " added successfully");
        }





     public void removeStudent(Student student) {
        students.remove(student);
         activityLog.add("Added student: " + student.name);
         System.out.println("Student " + student.name + " added successfully");
     }

    public void removeStudent(int studentId, String name) {
        Student newStudent = new Student(studentId, name);
        students.remove(newStudent);
        activityLog.add("Removed student: " + name);
        System.out.println("Student " + name + " removed successfully!");

    }


    public void findByName(String name) {

     }

    @Override
    public String toString() {
        return "GradeManager{" +
                "students=" + students +
                ", activityLog=" + activityLog +
                '}';
    }
}
//}
