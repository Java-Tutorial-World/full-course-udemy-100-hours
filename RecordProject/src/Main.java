public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("s9989" + i,
                    switch (i){ //here the name is replaced with switch to account for 5 names
                case 1 -> "Mary";
                case 2 -> "Bolu";
                case 3 -> "Antony";
                case 4 -> "Kolade";
                case 5 -> "Sarah";
                        default -> "Name Not On List";
                    }, "05-05-2022",
                    "Java Master Class" );
            System.out.println(s);
        }

        Student pojoStudent = new Student("K6788","Kolade",
                "09-09-2022", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S44322","Sarah",
                "08-04-2022","Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + "Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

//        wall.setWidth(-1.5);
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("distance(0,0)" + first.distance());
        System.out.println("distance(second)" + first.distance(second));

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);

        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("Total= " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}