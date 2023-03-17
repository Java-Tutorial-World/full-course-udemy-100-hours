import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces( 3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces ( double num1, double num2) {

        num1 = 1000d * num1 ;
        num2 = 1000d * num2 ;

        int newNum1 = (int) num1;
        int newNum2 = (int) num2;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(newNum1);
        System.out.println(newNum2);

        if (newNum1 == newNum2){
            return true;
        }else
        return false;
    }
}
