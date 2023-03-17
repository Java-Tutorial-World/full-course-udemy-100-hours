//this code did not work. I will come back to it later.
//this code will calculate the hours and return the remaining minutes and seconds

public class HoursConversion {

    public static void main(String[] args) {
        getDurationString(36000);
        getDurationString(60,56);

    }

    public static String getDurationString (int seconds){
        int hours = seconds / 3600;


        if ( seconds >= 0){
            return hours + "hours";
        }else
            return "Invalid input please input a valid number";

    }

    public static String getDurationString (int minutes, int seconds){
        int hoursRemains = (minutes * 60) - seconds;

        if ( minutes >= 0 && seconds >=0 && seconds <=59 ){
            return "yes";
        }else
            return "Invalid parameter";

    }

}

