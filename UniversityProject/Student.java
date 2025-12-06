import java.util.ArrayList;

public class Student {
    //Instances variables
    private int studentID;
    private String name;
    private ArrayList<String> enrolledCourses;

    //Constructor
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    //Methods
    public String getName() { //Retrieves the student name

    }

    public int getStudentID() {//Retrieves the student's ID

    }

    public boolean enrollCourse(String courseName) {//Enrolls the student into a course

    }

    public void displayCourses() {//Display enrolled courses

    }
}
