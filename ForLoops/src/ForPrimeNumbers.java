public class ForPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "not prime number"));
        System.out.println("1 is " + (isPrime(1) ? "" : "not prime number"));
        System.out.println("2 is " + (isPrime(2) ? "" : "not prime number"));
        System.out.println("3 is " + (isPrime(3) ? "" : "not prime number"));
        System.out.println("8 is " + (isPrime(8) ? "" : "not prime number"));
        System.out.println("17 is " + (isPrime(17) ? "" : "not prime number"));

    }

    public static boolean isPrime ( int wholeNumber) {
        int x = wholeNumber;


        if (wholeNumber <= 2 ){
            return (wholeNumber ==2);
        }
        for ( int divisor = 2; divisor < wholeNumber; divisor++){
            if (wholeNumber % divisor == 0){
                return  false;
            }
        }

        return true;
    }
}
