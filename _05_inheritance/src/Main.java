public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Generic", "huge", 300);
        doAnimalStuff(animal1, "slow");

        Dog dog1 = new Dog();
        doAnimalStuff(dog1, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(animal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
