// TestCode.java
// TRIAL TEST 2 - Question 1
// SECJ2154 - 2023/2024-2
// Name: Lim Jie Han
// Matric No.: A21EC3013

import java.util.ArrayList;

class Course {
    private String courseName;
    private String teacher;
    private ArrayList<Student> studentList;

    public Course(String courseName, String teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.studentList = new ArrayList<>();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getTeacher() {
        return this.teacher;
    }

    public boolean addStudent(Student student) {
        if (student == null || studentList.contains(student)) {
            return false;
        }
        studentList.add(student);
        return true;
    }

    public void printStudents() {
        for (Student s : studentList) {
            System.out.println(s.getName() + ", " + s.getAge() + " year(s) old");
        }
        System.out.println("Current number of students: " + studentList.size());

        if (!studentList.isEmpty()) {
            int minAge = studentList.get(0).getAge();
            for (Student s : studentList) {
                if (s.getAge() < minAge) {
                    minAge = s.getAge();
                }
            }
            System.out.println("Youngest student age: " + minAge + " years old");
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

class TestCode { // Testing code
    public static void main(String[] args) {
        Course oop = new Course("Object Oriented Programming", "Danial Ali");
        oop.addStudent(new Student("Edwin Koh", 23));
        oop.addStudent(new Student("Wafia Daud", 22));
        oop.addStudent(new Student("Zafran Saad", 20));

        System.out.println(oop.getCourseName() + " has the following students:");
        oop.printStudents();

        System.out.println(oop.getCourseName() + " is taught by " + oop.getTeacher());
    }
}

