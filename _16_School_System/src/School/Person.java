package School;

public abstract class Person {
    private String name;
    private int idNumber;
    private static int population = 0;

    public Person(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        Person.population++;
    }

    public static void getPopulation(){
        System.out.println("Current Population: " + Person.population);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public void getName(){
        System.out.println(this.name);
    }
}
