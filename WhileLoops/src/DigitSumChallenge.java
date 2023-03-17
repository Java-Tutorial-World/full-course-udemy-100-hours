public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigit(1234));
        System.out.println("The sum of the digits in number -1234 is " + sumDigit(-1234));
        System.out.println("The sum of the digits in number 2346 is " + sumDigit(2346));

    }

    public static int sumDigit ( int number){

        if ( number <= 0){
            return -1;
        }
        int sum = 0;
        while ( number > 9 ){
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
