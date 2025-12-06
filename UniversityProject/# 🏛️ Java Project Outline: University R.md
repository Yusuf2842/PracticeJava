University Project Outline

## Goal
Build a text-based application to manage students and courses, focusing on core OOP, classes, loops, and ArrayLists.

## 📝 Step 1: Define the Student Class

**Class Name:** `Student`

| Component | Detail | Concepts Practiced |
| :--- | :--- | :--- |
| **Fields (Private)** | `private int studentID` | Encapsulation |
| | `private String name` | |
| | `private ArrayList<String> enrolledCourses` | ArrayList Data Structure |
| **Constructor** | `public Student(int studentID, String name)` | Object Creation |
| **Methods (Public)** | `getName()`, `getStudentID()` | Getters |
| | `enrollCourse(String courseName)`: Adds a course name to the list. | Object Method |
| | `displayCourses()`: Loops through and prints the enrolled courses. | Loops |

## 📝 Step 2: Define the Course Class

**Class Name:** `Course`

| Component | Detail | Concepts Practiced |
| :--- | :--- | :--- |
| **Fields (Private)** | `private String courseCode` (e.g., "CS101") | Encapsulation |
| | `private String courseName` | |
| | `private int maxCapacity` | |
| **Constructor** | `public Course(String courseCode, String courseName, int maxCapacity)` | Object Creation |
| **Methods (Public)** | `getCourseCode()`, `getCourseName()`, `getMaxCapacity()` | Getters |

## 📝 Step 3: Define the Registrar Class (The Logic Manager)

**Class Name:** `Registrar`

| Component | Detail | Concepts Practiced |
| :--- | :--- | :--- |
| **Fields (Private)** | `private ArrayList<Student> studentList` | ArrayList for Data Management |
| | `private ArrayList<Course> courseList` | |
| | `private int nextStudentID = 1001` | Tracking IDs |
| **Constructor** | Initializes the two `ArrayList` fields. | Initialization |
| **Methods (Public)** | `addStudent(String name)`: Increments `nextStudentID`, creates the `Student` object, and adds it to `studentList`. | Object Instantiation & State Management |
| | `addCourse(String code, String name, int capacity)`: Creates the `Course` object and adds it to `courseList`. | Object Instantiation |
| | `enrollStudent(int studentID, String courseCode)`: **(Challenging)** Uses a **Loop** to find the student and the course by ID/Code, then calls the student's `enrollCourse` method. | Loops & Object Interaction |
| | `displayAllStudents()`: Uses a **Loop** to iterate through `studentList` and print details for each student. | Loops & Printing |

## 📝 Step 4: Create the UniversityApp Class (Main Application)

**Class Name:** `UniversityApp`

* Contains the `public static void main(String[] args)` method.
* Uses the `Scanner` class to read user input.
* Creates one instance of the `Registrar`: `Registrar uniRegistrar = new Registrar();`
* Uses a `while(true)` loop to present the main menu:
    1.  Add Student
    2.  Add Course
    3.  Enroll Student
    4.  Display All Students
    5.  Exit
* Uses a **`switch` statement** or `if/else if` to handle the user's menu choice and call the appropriate methods on the `uniRegistrar` object.
