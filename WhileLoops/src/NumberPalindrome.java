public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));

    }

    public static boolean isPalindrome (int number){



        if ( number < 0){
            number *= -1;
        }
        int reverse = 0;
        int storedNumber = number;
        int lastDigit;

        while (storedNumber > 0){
            lastDigit = storedNumber %10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            storedNumber /= 10;

        }

        if( number == reverse ){
            return true;
        }else
            return false;
    }
}
