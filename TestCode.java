import.java.util.ArrayList;

class Course {
    private String courseName;
    private String teacher;
    private static double instances = 0;
    private ArrayList<Student> studentList; // Correct the declaration

    public String getCourseName(){
        return this.courseName;
    }
   
    public String getTeacher(){
        return this.teacher; // Correct the case
    }

    public Course(String courseName, String teacher){ 
        this.studentList = new ArrayList<>();
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public boolean addStudent(Student student){ // Add the return type
        if (student==null || studentList.contains(student)) { // Correct the case
            return false;
        }
        Course.instances++;
        studentList.add(student); // Add the parameter
    }

    public void printStudents(){
    for(Student s : studentList)
            System.out.println(s.getName() + ", with " + s.getAge() + " year(s)"); // Correct the reference
      System.out.println("Current #student "+ Course.instances);
      
      int y = studentList.get(3).getAge();
      System.out.println("Youngest # "+ y + " years old");
    }  
}  
    
class Student{
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
   
   class TestCode {// Testing code
    public static void main(String[] args){
        Course oop = new Course("Object Oriented Programming", "Danial Ali");
        oop.addStudent(new Student("Edwin Koh", 23));
        oop.addStudent(new Student("Wafia Daud", 22));
        oop.addStudent(new Student("Zafran Saad", 20));
        System.out.println(getCourseName() + " has the following students");
        oop.printStudents();
        System.out.println(getCourseName() + " has the following teacher "+getTeacher());   
    }
   }
