public class Computer extends Product {
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(String model, String manufacturerString,
                    ComputerCase computerCase, Monitor monitor,
                    Motherboard motherboard) {
        super(model, manufacturerString);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
