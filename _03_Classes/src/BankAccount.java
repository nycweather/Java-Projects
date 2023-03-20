public class BankAccount {
    private String AccountNumber;
    private double AccountBalance;
    private String CustomerName;
    private String CustomerEmail;
    private String PhoneNumber;

    public String getAccountNumber() {
        return AccountNumber;
    }

    // Getters and Setters
    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    // Methods
    public void deposit(double amount){
        AccountBalance += amount;
        System.out.println("Deposited $"+amount + " New Balance: "+AccountNumber);
    }

    public void withdraw(double amount){
        if (AccountBalance - amount < 0){
            System.out.println("Invalid. You only have $"+AccountBalance+" in this account.");
        } else {
            AccountBalance -= amount;
            System.out.println("Withdrew $"+amount + " New Balance: "+AccountBalance);
        }
    }
}
