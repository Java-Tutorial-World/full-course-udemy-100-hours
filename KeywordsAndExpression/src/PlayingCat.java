public class PlayingCat {
    public static void main(String[] args) {
        boolean result = isCatPlaying(true, 33);
        System.out.println(result);
    }
    public static boolean isCatPlaying ( boolean summer, int temperature){
        boolean isPlaying1 = temperature >=25 && temperature <= 35;
        boolean isPlaying2 = temperature >= 35 && temperature <= 45;

        if ( summer && isPlaying1 ){
            return true;
        }else if (summer && isPlaying2 ){
            return true;
        }else if ( !summer && isPlaying1 ){
            return true;
        } else if (!summer &&  isPlaying2) {
            return false;
        } else
            return false;
    }
}
