public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Does two of the numbers have same digits? " + hasSameLastDigit(41,22,71));
        System.out.println("Is the number valid " + isValid(468));

    }

    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        boolean rangeOfNumbersValid = ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000));
        int lastDigit1 = 0;
        int lastDigit2 = 0;
        int lastDigit3 = 0;
        if (!rangeOfNumbersValid){
            return false;
        }
        if ( rangeOfNumbersValid){
            while (num1 > 0 && num2 > 0 && num3 > 0){
                lastDigit1 = num1 % 10;
//                num1 /= 10;

                lastDigit2 = num2 % 10;
//                num2 /= 10;

                lastDigit3 = num3 % 10;
//                num3 /= 10;

                if ( (lastDigit2 == lastDigit1) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3)){
                    return true;
                }else return false;
            }
        }

        return true;
    }

    public static boolean isValid ( int num4){
        boolean validRange = num4 >=10 && num4 <= 1000;

        if (validRange){
            return true;
        }
            return false;
    }
}
