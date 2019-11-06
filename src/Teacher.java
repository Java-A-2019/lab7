import java.util.ArrayList;

public class Teacher {
    String name;
    int age;
    ArrayList<Student> students;

    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
        this.students = new ArrayList<>();
    }

    public void teach(Student student){
        students.add(student);
        //your code here
    }
}
