//Task says I should write one method to return true if the parameter is between 1 and 9999
//or false if not. Parameter is month. Method is isLeapYear.
//If year is divisible by 4 or 400 and not 100, then it is a leap year.

//Second task want me to get the days in a month corresponding to the month number between 1 and 12.
//If year is not in 1 and 9999, I should return -1, if it is I should return the month number in my result.
//Task also wants me to use the first method to verify the leap year instead of creating a new statement.

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear( 9000));

        System.out.println(getDaysInMonth(4, 2020)) ;

    }

    public static boolean isLeapYear ( int year){
//        boolean rangeOfValidYear = year >= 1 && year <= 9999;
//        boolean isLeapYearTrue = year % 4 == 0;
//        boolean isLeapYearTrue400 = year % 400 == 0;
//        boolean isLeapYearTrue100 = year % 100 == 0;
        //USING SWITCH STATEMENT

//        boolean resultYear = switch ( year ){
//            case 1 -> isLeapYearTrue;
//            case 2 -> isLeapYearTrue400 ;
//            case 3 -> !isLeapYearTrue100 ;
//            default -> false;
//
//        };return resultYear;


        //USING IF STATEMENT
        boolean rangeOfValidYear2 = year >= 1 && year <= 9999;
        boolean isLeapYearTrue2 = (year )% 4 == 0;
        boolean isLeapYearTrue400 = (year ) % 400 == 0;
        boolean isLeapYearTrue100 = (year  ) % 100 == 0;

//        if (rangeOfValidYear2 && isLeapYearTrue2 && !isLeapYearTrue100){
//            return true;
//        } else if (rangeOfValidYear2 && isLeapYearTrue400) {
//            return true;
//        }else {
//            return false;
//        }


        //using the ternary method
        boolean result1 = rangeOfValidYear2 && isLeapYearTrue2 && !isLeapYearTrue100 ? true
        :rangeOfValidYear2 && isLeapYearTrue400 ;
        return result1;
    }

//    public static int getDaysInMonth (int month, int year){
//        boolean leapYearFromOne = isLeapYear(year);
//        boolean monthValidRange = month >= 1 && month <= 12;
//        boolean invalidYearRange = year < 1 && year > 9999;
//
//        if ( !monthValidRange || invalidYearRange){
//           return -1;
//        } else if ( month == 1 || month == 3 || month ==5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            return leapYearFromOne ? 30 : 31 ;
//        }else if ( month == 9 || month == 4 || month == 6 || month == 11){
//            return 31;
////        }else if ( !leapYearFromOne && month == 2 ){
////            return 28;
//        }else if ( month == 2){
//            return leapYearFromOne ? 29 : 28;
//        } else
//            return -1;
//
//    }

    //redo to use the tenarary method
    public static int getDaysInMonth (int month, int year){
        boolean leapYearFromOne = isLeapYear(year);
        boolean monthValidRange = month >= 1 && month <= 12;
//        boolean invalidYearRange = year < 1 && year > 9999;
        boolean rangeOfValidYear2 = year >= 1 && year <= 9999;

        int result = !monthValidRange || !rangeOfValidYear2 ? -1 : monthValidRange && !rangeOfValidYear2 ? -1 :
            month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ? 31
            : month == 4 || month == 9 || month == 6 || month == 11 ?  30
            : month == 2 && !leapYearFromOne ? 28 : 29;
        return result;
    }


}
//It took a while to figure the algorithm for this one, but Stack overflowed to my aid.
//I used the if statement because I could not use the switch to figure how I can work the
//leap year condition. https://stackoverflow.com/questions/8940438/number-of-days-in-particular-month-of-particular-year