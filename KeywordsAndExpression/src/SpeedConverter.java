public class SpeedConverter {

    public static void main(String[] args) {
        long convertKilometer = toMilesPerHour(75.114);


        System.out.println(convertKilometer);

        printConversion( 10.25);
    }

    public static long toMilesPerHour (double kilometersPerHour){

        double calculateMilesPerHour = (kilometersPerHour / 1.609);
        long roundCalculateMilesPerHour = Math.round(calculateMilesPerHour);


        if (kilometersPerHour < 0){
            return -1;
        } else{
            return roundCalculateMilesPerHour;
        }
    }

    public static void printConversion ( double kilometersPerHours) {

        if (kilometersPerHours < 0){
            System.out.println("Invalid Value");
        }else {
            System.out.println( kilometersPerHours + " km/h = " + toMilesPerHour(kilometersPerHours) + " mi/h" );
        }
    }
}
