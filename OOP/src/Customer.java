public class Customer {
    private String name = " ";
    private double creditLimit = 0.00;
    private String emailAddress = "email@email.com";

    public String getName(){
        return this.name;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

    public Customer (String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public Customer (){
        this ("default Name", 1000.0, "default@email.com");
        System.out.println("The default no args constructor.");
    }

    public Customer(String name, String emailAddress){
        this (name, 1000.0, emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
    }


}
