public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1, 0));
    }

    public static boolean hasEqualSum (int sum1, int sum2, int sum3) {

        long sumOfOneAndTwo = (sum1 + sum2);

        if ( sumOfOneAndTwo == sum3 ){
            return true;
        }else return false;

    }
}
