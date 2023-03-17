import java.rmi.StubNotFoundException;

public class Main {
    public static void main(String[] args) {

        Student max = new Student("Tim", 56);
        System.out.println(max.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent( "Jimmy", 10, "Carole");
        System.out.println(jimmy);
    }
}

class Student {
    private String name;
    private int age;

    Student (){

    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//    public String toString(){
//        return  super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
//        "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super (name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}