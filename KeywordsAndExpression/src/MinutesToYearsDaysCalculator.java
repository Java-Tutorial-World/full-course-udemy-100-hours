public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(-561600);
    }

    public static void printYearsAndDays ( long minutes) {
//
//        long toHours = minutes / 60;
//        System.out.println( minutes + "mins make " + toHours + "hrs");
//
//        long toDays = toHours / 24;
//        System.out.println( toHours + "hrs make " + toDays + "days");
//        long remainHours = toHours % 24;
//        System.out.println(remainHours + " remain from the days");

        int toYears = (int) ((minutes / 60) / 24)  / 365;
//        System.out.println( ((minutes / 60) / 24) + "days make " + toYears + "years");
        int remainDays = (int) ((minutes / 60) / 24) % 365;
//        System.out.println(remainDays + " remain days " + toYears + "years");

        if ( minutes < 0){
            System.out.println(" Invalid Value");
        }else
            System.out.println(minutes + " min = " + toYears + " y and " + remainDays + " d" );

    }
}
