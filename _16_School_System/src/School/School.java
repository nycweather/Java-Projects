package School;

import java.util.ArrayList;

public class School {
    private String name;
    private int schoolNum;
    private final String address;
    private int population = 0;
    private int students = 0;
    private int teachers = 0;
    private final ArrayList<Student> studentList = new ArrayList<>();

    public School(String name, int schoolNum, String address) {
        this.name = name;
        this.schoolNum = schoolNum;
        this.address = address;
    }

    public void addStudent(Student student){
        studentList.add(student);
        this.population++;
    }

    public void getStudentList(){
        for (Student i : studentList){
            i.getName();
        }
    }

    public void getPopulation(){
        System.out.println(this.name + " has " + this.population + " students.");
    }

}
