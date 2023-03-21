class Grocery extends Store{
    public boolean chain;

    public Grocery(String name, String address) {
        super(name, address);
    }

    @Override
    public void getInfo() {
        System.out.println("This store is a Grocery Store at: " + this.getAddress());
    }
}
