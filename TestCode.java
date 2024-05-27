
class Course {
    private String courseName;
    private String teacher;
    private static double instances = 0;
    private ArrayList(Student) studentList;

    public String getCourseName(){
        return this.courseName;
    }
   
    public String getTeacher(){
        return this.Teacher;
    }

    
    public String Course(String courseName, String teacher){
        this.studentList = new ArrayList<>();
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        if (Student==null || studentList.contains(Student)) {
            return false;
        }
        Course.instances++;
        studentList.add();
        return true;
    }

    public void printStudents(){
    for(Student s : studentList)
            System.out.println(studentList.getName() + ", with " + studentList.getAge() + " year(s)");
      System.out.println("Current #student "+ Course.instances);
      
      int y = studentList.get(3).getAge();
      System.out.println("Youngest # "+ Y + " years old");
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
