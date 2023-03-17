public class Main {
    public static void main(String[] args) {
        printInformation("Hello world!");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n ", helloWorld.indexOf('r'));

        System.out.printf("index of world = %d %n ", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n ", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n ", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n ", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("Value match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value match ignoring case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")){
            System.out.println("String contains with World");
        }
        if (helloWorld.contentEquals("World")){
            System.out.println("String content equals with World");
        }
    }

    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length );


        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is blank");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));


        Circle circle = new Circle(3.75);
        System.out.println("Cirlce.radius= " + circle.getRadius());
        System.out.println("Circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.radius= " + cylinder.getRadius());
        System.out.println("Cylinder.height= " + cylinder.getHeight());
        System.out.println("Cylinder.area= " + cylinder.getArea());
        System.out.println("Cylinder.volume= " + cylinder.getVolume());


        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}