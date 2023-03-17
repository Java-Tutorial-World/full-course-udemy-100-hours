import java.awt.*;

public class TextBlock {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:" + "\n" +
                "\u2022 First Point" + "\n" +
                "\u2022 Second Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted list:
                     \u2022 First Point
                          \u2022 Second Point""";
        System.out.println(textBlock);

        int age = 40;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Year of Birth = %d%n", age,yearOfBirth);;

        for (int i = 1; i < 100000; i *=10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedCode = String.format("Your age is %d %n", age);
        System.out.println(formattedCode);

        formattedCode = "Your age is %d".formatted(age);
        System.out.println(formattedCode);
    }
}
