public class Car {
    public String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Car -> Start Engine.");
    }
    protected void runEngine(){
        System.out.println("Car -> Running Engine.");
    }
    public void drive(){
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasCar extends Car{
    private double mpg;
    private int cylinder = 4;

    public GasCar(String description) {
        super(description);
    }

    public GasCar(String description, double mpg, int cylinder) {
        super(description);
        this.mpg = mpg;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> all %d cylinders are fired up, Ready!%n", cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> %.2f MPG", mpg);
    }
}

class ElectricCar extends Car{
    private double mpkw;
    private int batterySize = 4;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double mpkw, int batterySize) {
        super(description);
        this.mpkw = mpkw;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("EV -> %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("EV -> %.2f MPKw", mpkw);
    }
}
