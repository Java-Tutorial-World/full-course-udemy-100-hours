public class Person {
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0 || age >100){
            System.out.println("0");
        }else
            this.age = age;
    }

    public boolean isTeen(){
        if(age >12 && age < 20){
            return true;
        }else
            return false;
    }

    public String getFullName(){
        return (this.firstName.isEmpty() && this.lastName.isEmpty()) ? "" :
                this.lastName.isEmpty() ? this.firstName :
                        this.firstName.isEmpty() ? this.lastName :
                                 String.join(" ",this.firstName,this.lastName).trim();
    }


}
