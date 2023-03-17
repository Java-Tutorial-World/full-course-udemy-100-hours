public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("Red");

        targa.describeCar();

//        BankAccount maneBankAccount = new BankAccount("123456",20,"Mr Mane","mrmane@mane.com","49909");
        BankAccount maneBankAccount = new BankAccount();
//        maneBankAccount.setAccountBalance(12);
        maneBankAccount.withdrawFund(10);
        maneBankAccount.depositFund(5);
        maneBankAccount.withdrawFund(12);
        maneBankAccount.depositFund(5);
        maneBankAccount.withdrawFund(12);
        maneBankAccount.depositFund(9.9);
        maneBankAccount.withdrawFund(10);

        SimpleCalculator myCalculator = new SimpleCalculator();
        myCalculator.setFirstNumber(5.0);
        myCalculator.setSecondNumber(4.0);
        System.out.println("add= " + myCalculator.getAdditionResult());
        System.out.println("subtract= " + myCalculator.getSubtractionResult());

        myCalculator.setFirstNumber(5.25);
        myCalculator.setSecondNumber(0);
        System.out.println("multiply= " + myCalculator.getMultiplicationResult());
        System.out.println("divide= " + myCalculator.getDivisionResult());

        Person darePerson = new Person();
        darePerson.setFirstName("");
        darePerson.setLastName("");
        darePerson.setAge(18);

        System.out.println("fullName= " + darePerson.getFullName());
        System.out.println("teen= " + darePerson.isTeen());

        //using the 3 argument constructor
        BankAccount darasAccount = new BankAccount("dara", "dara@email.com", "897787");
        System.out.println("Account No. " + darasAccount.getAccountNumber() +
                " name " + darasAccount.getCustomerName() + " balance : " +
                darasAccount.getAccountBalance() + ".");

        //using the Customer class constructor exercise.
        Customer bolusAccount = new Customer("omotosho bolu", 900, "bolu@email.com");
        System.out.println("bolu's account name " + bolusAccount.getName() + " bolu's credit limit " + bolusAccount.getCreditLimit()
        + " bolu's email " + bolusAccount.getEmailAddress() + "." );
    }
}