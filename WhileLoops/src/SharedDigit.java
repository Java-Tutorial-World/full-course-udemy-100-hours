public class SharedDigit {
    public static void main(String[] args) {
        System.out.println("Do we have a common digit between the two numbers: " + hasSharedDigit(12,23) );

    }

    public static boolean hasSharedDigit ( int num1, int num2){

        boolean validRange = num1 >= 10 && num1 <= 99;
        boolean validRange2 =  num2 >=10 &&  num2 <= 99;
        int lastDigit1 = 0;
        int lastDigit2 = 0;

        if ( !validRange ){
            return false;
        }

        if ( validRange && validRange2 ){
            while (num1 > 0 && num2 > 0 ){
                lastDigit1 = num1 % 10;
                num1 /= 10;
                lastDigit2 = num2 % 10;
                num2 /= 10;

                System.out.println(lastDigit1 + "is last digit1 " + lastDigit2 +" is last digit 2");
                if ( (lastDigit1 == lastDigit2) || (num1 == num2) || (num1 == lastDigit2) || (num2 == lastDigit1)){
                    return true;
                }else return false;
            }
        }
        return false;
    }

}
