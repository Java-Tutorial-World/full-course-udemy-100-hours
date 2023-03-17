public class FirstLastDigitSum {
    public static void main(String[] args) {

        System.out.println("sum is " + sumFirstAndLastDigit(93192125));

    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }
        int firstDigit = 0;
        int lastDigit= number % 10;

            System.out.println("last digit is " + lastDigit);
        while (number > 0 ){
            firstDigit = ( number % 10) ;
            number /= 10;

//            System.out.println("first digit is "+ firstDigit);
//            break;
        }
        int sumOfDigits= lastDigit + firstDigit;

        return sumOfDigits;
    }
}
