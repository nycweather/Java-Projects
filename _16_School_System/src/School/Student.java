package School;

public class Student extends Person{

    private int grade;
    private float currentGPA;

    public Student(String name, int idNumber, int grade, float currentGPA) {
        super(name, idNumber);
        this.grade = grade;
        this.currentGPA = currentGPA;
    }
}
