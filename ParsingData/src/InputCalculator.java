import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true){
            if(scanner.hasNextInt()){
                sum+= scanner.nextInt();
                avg = Math.round((double)sum / ++counter);
            } else {
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
