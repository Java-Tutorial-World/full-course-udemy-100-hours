public class InheritanceChallenge {

}

class Worker {
    private String name;
    private String birthDate;
    private String endDate;
    
    public Worker(){

    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return currentYear - birthYear;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate (String endDate){
        this.endDate = endDate;
        System.out.println();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

class Employee extends Worker{
    private long employeeID;
    private String hireDate;

    Employee (){

    }

    public Employee(String name, String birthDate, String endDate, long employeeID, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeID, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, employeeID, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
//        return (int) annualSalary / 26;
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retired(){
        terminate("12/12/2023");
        isRetired = true;
        System.out.println();
    }
}

class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeID, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeID, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }
}