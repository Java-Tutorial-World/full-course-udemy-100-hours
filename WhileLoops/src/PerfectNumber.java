public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber (int number){
        if (number < 1 ){
            return false;

        }

        int sumNumber = 0;
        for ( int i = 1; i <= number; i ++){
            if( number % i == 0 ){
                sumNumber += i;

//                return true;
            }
            if( sumNumber == number){
                return true;
            }
        }
        return false;
    }
}
