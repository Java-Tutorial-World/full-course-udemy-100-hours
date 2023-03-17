public class Main {
    public static void main(String[] args) {
//        for (int counter = 2; counter <= 5 ; counter ++) {
//            System.out.println(counter);
//        }
        for (double x = 1.0 ; x <= 5.0; x ++ ) {
//            System.out.println("x is " + x);
            double yResult = calculateInterest(10000.0, x );
            System.out.println("x rate is " + yResult);
        }

        for (double x = 7.5; x >= 7.5 && x <= 10; x +=0.25){
            double newResult = calculateInterest( 100, x);
            if (newResult > 9.0){
                break;
            }
            System.out.println("The new interest rate in dollars is for " + x + " is " + newResult );
        }

//        System.out.println("interest rate is " + calculateInterest(10000, 2));
    }

    public static double calculateInterest (double amount, double interest){

        return (amount * (interest / 100));
    }
}