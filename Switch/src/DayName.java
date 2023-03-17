public class DayName {
    public static void main(String[] args) {
        printDayOfWeek(0);
    }

    public static void printDayOfWeek(int day) {

        String dayOfTheWeek = switch ( day ) {
            case 0 -> " is Sunday";
            case 1 -> " is Monday";
            case 2 -> " is Tuesday";
            case 3 -> " is Wednesday";
            case 4 -> " is Thursday";
            case 5 -> " is Friday";
            case 6 -> " is Saturday";

            default ->"Not a day of the week";
        };
        System.out.println("day " + day + " is a " +  dayOfTheWeek);

        //writing the same program with an if statement

        if (day == 0){
            System.out.println( day + " is a Sunday");
        }else if ( day == 1){
            System.out.println(day + " is a Monday");
        }else if ( day == 2){
            System.out.println( day + " is a Teusday");
        }else if ( day == 3){
            System.out.println(day + " is a Wednesday");
        }else if ( day == 4){
            System.out.println(day + " is a Thursday");
        }else if ( day == 5){
            System.out.println(day + " is a Friday");
        }else if ( day == 6){
            System.out.println(day + " is a Saturday");
        }else System.out.println(" Not a valid day in the week");
    }
}

//Solved this challenge with this resource: https://www.baeldung.com/java-switch
//I learnt to pass the switch statement as an expression by putting it in a variable
//I called the variable after the switch statement in a println, instead of calling it
//inside the switch statement. Phewww!!!
//The difference between switch statement and switch expression is that expression is
//stored in a variable and is return in a data type the switch supports