import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class App {
    public static   void main(String[] args){
        System.out.println("I created the App class");
        userName();
        userID();

    }
    public static void userName(){
        String carType;
        carType = "lambo";
        carType = "ferrari";
        int carID = 7738383;
        int i1 = 543;

        final   String AGE_RANGE = "24-50";
        String carTypeFake = carType;
        System.out.println(carType);
        System.out.println(carID);
        System.out.println(carTypeFake);
        System.out.println("call from the App class");
        System.out.println(AGE_RANGE);
        System.out.println(i1);


    }
    public static void userID() {
        float accountBalance = 455.22f;
        double amountDeposited = 3323.23;
        char c1 = 'a';
        char c2 = 1;

        Scanner inputName = new Scanner(System.in);
        System.out.println("enter your name here: ");
        System.out.println("your name is " + inputName.nextLine());

        Scanner inputAge =new Scanner(System.in);
        System.out.println("enter you age here: ");
        System.out.println("you are " + inputAge.nextInt() + " years old");

        Scanner acceptTerms = new Scanner (System.in);
        System.out.println("Are you aware of the terms before proceeding?" );

        System.out.println("Your answer is " + acceptTerms.nextBoolean());

        Scanner favoriteNumber = new Scanner(System.in);
        System.out.println("Enter your favorite number: ");
        System.out.println(favoriteNumber.nextInt() + " is your favorite number.");

        Scanner anotherName = new Scanner(System.in);
        Scanner yourAge = new Scanner(System.in);

        System.out.print("what is your name? ");
        System.out.print("how old are you? ");
        System.out.println("your name is " + anotherName.next() + " and you are " + yourAge.nextInt() + " years old");

        String passName = anotherName.next();
        int passAge = yourAge.nextInt();

        System.out.println("your name is " + passName + " and you are " + passAge + " years old");

        String newName = "This should be in upper case";
        String newText = newName.toUpperCase();
        System.out.println(newText);
        System.out.println(c2);
        System.out.println(c1);
        System.out.println("the user ID method");
        System.out.println(accountBalance);
        System.out.println(amountDeposited);


        int x =20;
        int y = 10;

        if (x>y){
            System.out.println("the value of x is greater than y");
        }else{
            System.out.println("the value of y is greater than x");

        }

        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Input a random number: ");
        double num1 = inputNumber1.nextInt();

        double result = num1 % 2;

        if (result == 0){
            System.out.println(num1 + " is even");
        }else {
            System.out.println(num1 +" is odd");
        }

        Scanner inputNum4 = new Scanner(System.in);
        System.out.println("input a number to test switch");
        int num4 = inputNum4.nextInt();
        int outPut = num4 % 2;

        switch (outPut){
            case 0:
                System.out.println(num4 + "is an even number");
                break;
            default:
                System.out.println(num4 + " is an odd number");
        }


    }
}
