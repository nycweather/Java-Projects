import java.util.ArrayList;

abstract class Store {
    private final String name;
    private final String address;
    public ArrayList<ProductForSale> items;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract void getInfo();
    public String getAddress(){
        return this.address;
    }

}
