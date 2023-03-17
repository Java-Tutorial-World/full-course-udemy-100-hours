public class megaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes ( int kiloBytes){
        int megabytes = (kiloBytes / 1024);
        int megabytesRound = Math.round(megabytes);

        int kilobytes = (kiloBytes % 1024);

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else
        System.out.println(kiloBytes + " KB = " + megabytesRound + " MB and " + kilobytes + " KB");
    }
}
