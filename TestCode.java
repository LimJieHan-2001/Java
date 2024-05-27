import java.util.ArrayList;

class Course {
    private String courseName;
    private String teacher;
    private static double instances = 0;
    private ArrayList<Student> studentList; // Corrected the declaration

    public String getCourseName(){
        return this.courseName;
    }
   
    public String getTeacher(){
        return this.teacher; // Corrected the case
    }

    public Course(String courseName, String teacher){ 
        this.studentList = new ArrayList<>();
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public boolean addStudent(Student student){ // Added the return type
        if (student == null || studentList.contains(student)) { // Corrected the case
            return false;
        }
        Course.instances++;
        studentList.add(student); // Added the parameter
        return true; // Added the return statement
    }

    public void printStudents(){
        for (Student s : studentList)
            System.out.println(s.getName() + ", with " + s.getAge() + " year(s)"); // Corrected typo
        System.out.println("Current #students: " + Course.instances);
        
        // Added error handling for accessing the 4th student
        if (studentList.size() > 3) {
            int y = studentList.get(3).getAge();
            System.out.println("Youngest # " + y + " years old");
        } else {
            System.out.println("Less than 4 students in the course.");
        }
    }  
}  
    
class Student {
    private String name;
    private int age;
 
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
   
class TestCode { // Testing code
    public static void main(String[] args){
        Course oop = new Course("Object Oriented Programming", "Danial Ali"); // Added semicolon
        oop.addStudent(new Student("Edwin Koh", 23));
        oop.addStudent(new Student("Wafia Daud", 22));
        oop.addStudent(new Student("Zafran Saad", 20));
        System.out.println(oop.getCourseName() + " has the following students"); // Corrected method call
        oop.printStudents();
        System.out.println(oop.getCourseName() + " has the following teacher " + oop.getTeacher()); // Corrected method call
    }
}
