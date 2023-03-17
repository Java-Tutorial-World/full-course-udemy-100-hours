public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(isOdd(9));
        System.out.println(sumOdd(1, 100));

    }

    public static boolean isOdd (int numbers){

        if ((numbers > 0) && (numbers % 2 != 0)){
            return true;
        }else
            return false;
    }


    public static int sumOdd ( int start, int end) {
        int sumOfAllRange = 0;

        if((start >= 0 && end >= 0) && end >= start){
            for (int i= start; i <=end; i++){
                if (isOdd(i)){
                    sumOfAllRange+= i;
                }
            }

        }else {
            return -1;
        }
        return sumOfAllRange;
    }
}
