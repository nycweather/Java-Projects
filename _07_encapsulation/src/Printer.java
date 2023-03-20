public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    final boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel<= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public void printPages(){
        if (duplex){
            pagesPrinted += tonerLevel/2;
        } else {
            pagesPrinted += tonerLevel;
        }
    }
}
