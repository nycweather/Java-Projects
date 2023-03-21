abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public void printPricedItem(int qty){
        System.out.println(type + "$" + this.price*qty);
    }

    public double getSalesPrice(){
        return 0.1;
    }

    public abstract void showDetails();
}
