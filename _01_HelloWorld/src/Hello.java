public class Hello {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double var3 = (var1 + var2) * 100.00D;
        double remained = var3 % 40;
        System.out.println(remained);
        boolean con1 = (remained == 0);
        System.out.println(con1);
        if (!con1){
            System.out.println("Your statement is false");
        } else {
            System.out.println("Your system is true");
        }
    }
}
