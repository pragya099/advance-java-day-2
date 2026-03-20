class Student {
    String name;
    int age;
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        Student s2 = s1;
        s2.name = "Bob";
        System.out.println(s1.name);
    }
}
