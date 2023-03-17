public class Sum3and5Challenge {

    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;

        for ( int loopNumber = 1; loopNumber < 1000; loopNumber ++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if (countOfMatches == 5) {
                break;
            }


            int countNumber1 = 0;
            int countNumber2 = 0;
            for (int i = 10; i < 1000; i++) {
                if ((i % 5 == 0) && (i % 3 == 0)) {
                    countNumber1++;
                    System.out.println("The sum of number divisible by 5 and 3 is " + (countNumber2 += i));
                }
                if (countNumber1 == 5) {
                    break;

                }
            }
            System.out.println("Sum = " + countNumber2);
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}
