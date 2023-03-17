public class MethodOverloading {

    public static void main(String[] args) {

        double finalCentimeter = (convertToCentimeters(6));

        double finalFeet = convertToCentimeters(5,8);

        System.out.println("The feet is " + finalFeet + " the centimeter is " + finalCentimeter + ". " );



    }

    public static double convertToCentimeters(int heightInInches) {

        double heightInCentimeters = (double) heightInInches * 2.54;

        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeets, int heightInInches) {
        int convertFeetToInches =  ((heightInFeets * 12) + heightInInches);
        double convertFeetInchesToCentimeter =  convertToCentimeters(convertFeetToInches);

        return convertFeetInchesToCentimeter;

    }

}