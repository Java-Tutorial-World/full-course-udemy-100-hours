public class BankAccount {

    private String accountNumber = "89988998";
    private double accountBalance = 0.0;
    private String customerName = "Mr Mane";
    private String email = "darelekan@gmail.com";
    private String phoneNumber = "2348998890";

    public BankAccount(){
        this("9098898", 10,"newCustomer name", "newcustomer@new.com","+234" );
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName,
                       String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone; //this. keyword not required as the variable is assigned to a different name called phone.

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("1234", 90, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(){
        this.accountNumber = accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund (double depositedAmount){
        System.out.println("Hi " + getCustomerName() +" you just deposited N" + depositedAmount +
                " and you new balance is N" + (this.accountBalance += depositedAmount));
    }

    public  void withdrawFund(double amountToWithdraw){

        if ( amountToWithdraw <= this.accountBalance){
            System.out.println("Hi "+ getCustomerName() + " You make a withdrawal of N"+ amountToWithdraw +
                    " Your new account balance is N" + (this.accountBalance -= amountToWithdraw) );
        }else
        System.out.println("Your account balance "+ this.accountBalance +" is not sufficient for withdrawal");
    }
}
