import java.util.ArrayList;

public class Registrar {
    //Instances Variables
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;
    private int nextStudentID = 1001;

    //Constructor
    public Registrar() { //Keeps the list of students and courses
        this.studentList = new ArrayList<Student>();
        this.courseList = new ArrayList<Course>();
    }

    //Methods
    public Student addStudent(String name) { //Adds a new student objct

    }

    public Course addCourse(String courseCode, String courseName, int maxCapacity) { //Adds a new course object

    }

    public void enrollStudent(int studentID, String courseCode) { //Enrolls student object to course object

    }

    public String displayAllStudents() { //Displays all available students

    }

}
