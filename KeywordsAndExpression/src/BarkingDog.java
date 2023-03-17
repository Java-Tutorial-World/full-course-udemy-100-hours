public class BarkingDog {

    public static void main(String[] args) {

        boolean toWakeupTime = shouldWakeUp(true, 0);
        System.out.println(toWakeupTime);

    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){

        boolean isBarking = false;

        if (barking && hourOfDay < 0 || hourOfDay > 23 ){
            return false;
        }else if (barking && hourOfDay >= 0 && hourOfDay < 8 || hourOfDay ==23 ){
            return true;
        }
        return false;
    }
}
