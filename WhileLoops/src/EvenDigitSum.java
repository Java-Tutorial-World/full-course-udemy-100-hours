public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("The even digit sum is " + getEvenDigitSum( 43652) );
    }

    public static int getEvenDigitSum( int number){

        if (number < 0){
            return -1;
        }

        int sumDigits = 0;
//        int reducedNumber = number;
        int lastDigits = 0;

        while (number > 0){
            lastDigits = number % 10;
            number /=10;
            if ( lastDigits % 2 == 0){
                System.out.println(lastDigits + " is last digit");

                sumDigits += lastDigits;
                System.out.println(sumDigits + " is sum of digit");

            }
        }
        return  sumDigits;
    }
}
