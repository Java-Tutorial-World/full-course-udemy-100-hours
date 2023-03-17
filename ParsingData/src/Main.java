import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println(getInputYear("2022"));


    }

    public static String getInputYear(String currentYear){
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = s.nextLine();

//        String currentYear = "2022";
//        String usersDateOfBirth = "1999";

        int presentYear = Integer.parseInt(currentYear);
        if ( presentYear < 1900 ){
            return "Invalid Year";
        }


        System.out.println("Enter year of birth? ");


        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year <= " + (presentYear - 125) + " and <= " + (presentYear));
//            Scanner y = new Scanner(System.in);
//            String inputYearOfBirth = y.nextLine();
//            int yourYear = Integer.parseInt(inputYearOfBirth);
//            age = presentYear - yourYear;
            try{
                age = checkData(presentYear, s.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed. Try again. ");
            }
        }while (!validDOB);

        return "Hi " + name + " welcome to Java Language. You are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear) ){
            return -1;
        }
        return (currentYear - dob );
    }
}