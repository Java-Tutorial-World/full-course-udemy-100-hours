public class TeenNumberChecker {

    public static void main(String[] args) {
       boolean teenResult = hasTeen(22,23,34);
        System.out.println( teenResult);

        System.out.println(isTeen(13));
    }

    public static boolean hasTeen ( int firstAge, int secondAge, int thirdAge) {
        boolean teen = firstAge >= 13 && firstAge <= 19;
        boolean teen2 = secondAge >= 13 && secondAge <= 19;
        boolean teen3 = thirdAge >= 13 && thirdAge <= 19;
        boolean resultAge = true;

        if ( teen || teen2 || teen3 ){
            return  resultAge;
        }else return false;
    }

    public static boolean isTeen (int teenRange){
        boolean teenRangeAge = teenRange >= 13 && teenRange <= 19;

        if ( teenRangeAge ){
            return teenRangeAge;
        }else return false;
    }
}
