public class Main {
    public static void main(String[] args) {

        System.out.println(getQuarter("July"));

//        int value = 9;
//
//        if ( value == 1) {
//            System.out.println("value was 1");
//        }else if (value == 2){
//            System.out.println("Value was 2");
//        }else
//        System.out.println("Value was not 1 or 2");

        int switchValue = 4;

        switch ( switchValue){
            case 1->
                System.out.println("Value is 1");

            case 2 ->
                System.out.println("Value is 2");

            case 3, 4, 5 ->
                System.out.println("Value is " + switchValue);
            default->
                System.out.println("Value is not between 1 and 5");
        }

    }

    public static String getQuarter (String month){

        switch (month){
            case "January", "February", "March" -> {
                return "First Quarter";
            }case "April", "May", "June" -> {
                return "Second Quarter";
            }case "July", "August", "September" ->{
                return "Third Quater";
            } case "October", "November", "December" ->{
                return "Fourth Quarter";
            }
        }return  "Not a month";

    }
}