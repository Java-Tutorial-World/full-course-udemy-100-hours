public class NumberOfPrimeNumbers {
    public static void main(String[] args) {

        int count = 0;
        for ( int i = 10; count < 3 && i <= 50; i++){
            if (isPrime(i)){
                System.out.println("Number "+ i + " is a prime number");
                count ++;
//                if (count == 3){
//                    System.out.println("Found 3 - Exiting for loop");
//                    break;
//                }
//                System.out.println("The total number of prime numbers between 10 and 50 is " + count);
            }
        }
    }

    public static boolean isPrime (int wholeNumber){

        if (wholeNumber <= 2){
            return wholeNumber == 0;
        }
        for (int divisor = 2; divisor < wholeNumber; divisor ++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
