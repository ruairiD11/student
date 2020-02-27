package ie.gmit;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student searchStudent(Student student) {
        Student result = new Student("a", "b");

        for(Student s : studentList) {
            if(s.equals(student)) {
                System.out.println("Student found");
                result = student;
            }
            else if(s.equals(null)){
                System.out.println("Student not found");
                result = null;
            }
        }
        return result;
    }
}
