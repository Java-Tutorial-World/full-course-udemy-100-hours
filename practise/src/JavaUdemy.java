public class JavaUdemy {
    public static void  main (String [] args) {
        System.out.println("Here we go again");

        int topScore = 80;
        if (topScore >= 90) {
            System.out.println("You are good to go");
        }
        int secondTopScore = 59;
        if (topScore > secondTopScore && secondTopScore >= 60) {
            System.out.println("You passed above average");
        }

        int thirdTopScore = 50;
        if ((secondTopScore <= 59) || (secondTopScore > thirdTopScore)) {
            System.out.println("You are below average");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("There is an error here");
        }

        String makeOfCar = "Innoson";
        boolean isDomestic = makeOfCar == "Innoson" ? true : false;

        if (isDomestic){
            System.out.println("This is made in Nigeria");
        }

        String s = (!isDomestic) ? "This is made in Nigeria" : "This is not made in Nigeria";
        System.out.println(s);




        double mydoubleOne = 20.00d;
        double mydoubleTwo = 80.00d;

        double sumMyDouble = (double) (20.00 + 80.00) * 100.00d;
        System.out.println("My sum double result is: " + sumMyDouble);

        double remainderDouble = sumMyDouble % 340.00d;
        System.out.println("This calculation has a remainder of: " + remainderDouble);

        boolean isRemainder = remainderDouble == 0.00 ? true : false;
        System.out.println("This calculation remainder is not: " + isRemainder);

        if (remainderDouble != 0.00){
            System.out.println("Got some remainder");
        }


    }


}
