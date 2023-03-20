public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdraw(100);
        bobsAccount.deposit(42.13);
        bobsAccount.withdraw(155);
        bobsAccount.withdraw(15);

    }
}
