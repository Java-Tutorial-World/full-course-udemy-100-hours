public class LeapYear {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(isLeapYear(9000));
    }

    public static boolean isLeapYear ( int  year ) {

        int isDivisibleBy4 = year % 4;
        int isDivisibleBy100 = year  % 100;
        int isDivisibleBy400 = year % 400;

        boolean validYearRange = ( year >= 1 && year <= 9999 );

        if ( validYearRange && isDivisibleBy4 == 0 && isDivisibleBy100 != 0){
            return true;
        }else if ( validYearRange && isDivisibleBy400 == 0){
            return true;
        }else
            return false;
    }

}
