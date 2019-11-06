public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr.A", 33);
        Teacher teacher2 = new Teacher("Mr.B", 40);

        Student student1 = new Student("Bob", 16);
        Student student2 = new Student("Alice", 17);
        Student student3 = new Student("Jack", 18);

        teacher1.teach(student1);
        teacher1.teach(student2);
        teacher2.teach(student3);

        student1.introduce();
        student2.introduce();
        student3.introduce();
    }
}
