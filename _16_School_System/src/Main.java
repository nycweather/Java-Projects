import School.School;
import School.Student;

public class Main {
    public static void main(String[] args) {
        Student person1 = new Student("Dev", 230022, 12, 3.5f);
        Student person2 = new Student("Md", 210022, 12, 3.1f);
        Student person3 = new Student("Alex", 230322, 11, 3.3f);
        Student person4 = new Student("Jeff", 232222, 11, 3.0f);
        System.out.println(person1);
        School Hillcrest = new School("Hillcrest High School", 14, "123-45 67th street");
        Hillcrest.addStudent(person1);
        Hillcrest.addStudent(person2);
        Hillcrest.addStudent(person3);
        Hillcrest.addStudent(person4);


        Hillcrest.getStudentList();
        Hillcrest.getPopulation();
    }
}
