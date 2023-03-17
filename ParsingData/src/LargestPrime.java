public class LargestPrime {
    public static void main(String[] args) {
        System.out.print(getLargestPrime(21));
    }

    public static int getLargestPrime (int number){
        if( number <= 1){
            return -1;
        }

//        int randomNumber = 2;
        int randomPrime = 1;

        for (int divisor = 1; divisor <= number; divisor ++){
            if(number % divisor == 0){
                int randomNumber = 0;
                for (int i = 1; i <= divisor; i++){
                    if(divisor % i == 0)randomNumber++;
                }
                if(randomNumber == 2) randomPrime = divisor;
            }
        }
        return randomPrime;
    }
}
