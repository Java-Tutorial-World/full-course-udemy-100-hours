public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));

    }

    public static int getGreatestCommonDivisor (int first, int second){
        if ( first < 10 || second < 10){
            return -1;
        }

        int divisor1 = 0;
        int randomNumber = 1;

        while (randomNumber <= first && randomNumber <= second ){
            randomNumber ++;
            if ( (first % randomNumber == 0) && (second % randomNumber == 0) ){
                divisor1 = randomNumber;

            }
        }
        System.out.println("The greatest divisor is " + divisor1);
        return divisor1;
    }
}
