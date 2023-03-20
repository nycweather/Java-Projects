public class Main {
    public static void main(String[] args) {
        Car myNewCar = new Car("Honda Civic 2022");
        runRace(myNewCar);
    }
    public static void runRace(Car myCar){
        myCar.startEngine();
        myCar.drive();
    }
}
