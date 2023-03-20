public class Main {
    public static void main(String[] args) {
        ComputerCase myCase = new ComputerCase("100p", "Phantex", "Thunderpower 800w");
        Monitor myMonitor = new Monitor("27inch Gaming", "AOC", 27, "2540 x 1440");
        Motherboard myMotherboard = new Motherboard("SOC 270x", "MS", 4, 6, "3.01");
        Computer myComputer = new Computer("Custom", "By me", myCase, myMonitor, myMotherboard);

        myComputer.getMonitor().drawPixelAt(0, 0, "Red");
        myComputer.getMotherboard().loadProgram("windows 10 ");
        myComputer.getComputerCase().pressPowerButton();

    }

}
