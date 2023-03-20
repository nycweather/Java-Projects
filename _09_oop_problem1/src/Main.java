public class Main {
    public static void main(String[] args) {

//        Car myCar = new Car("Toyota corolla 2021");
//        runRace(myCar);
        Car myJeep = new GasCar("2022 Jeep Grand Cherokee", 20, 6);
        runRace(myJeep);

        }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}

