public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(9);

    }

    public static void printNumberInWord (int number){
        //the task is to print string "ZERO", "ONE"...."NINE", as it corresponds to the
        //figure 1,2,3....9. Digits not in that range would print "OTHER"

        //USING THE SWITCH STATEMENT

        String resultNumber = switch ( number ){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";

            default -> "OTHER";
        };
        System.out.println(resultNumber);

        //I figured if I will be printing the case result as void, I will use the
//System.out.println in the switch statement.
//However, if I were to return the result as a variable (as expression) or in a data type,
//I will not need the System.out.println in the switch statement. Just like
//the above

        //USING THE IF ELSE STATEMENT
        String resultNumber2 = "ZERO";
        if ( number == 0){
            resultNumber2 = "ZERO";
        } else if (number == 1) {
            resultNumber2 = "ONE";
        } else if (number == 2) {
            resultNumber2 = "TWO";
        } else if ( number == 3){
            resultNumber2 = "THREE";
        } else if ( number == 4 ){
            resultNumber2 = "FOUR";
        } else if ( number == 5 ){
            resultNumber2 = "FIVE";
        } else if ( number == 6 ){
            resultNumber2 = "SIX";
        } else if ( number == 7 ) {
            resultNumber2 = "SEVEN";
        } else if  ( number == 8 ){
            resultNumber2 = "EIGHT";
        } else if ( number == 9){
            resultNumber2 = "NINE";
        } else
            resultNumber2 = "OTHER";
        System.out.println(resultNumber);

        //I felt the above if else is too rough, here is an attempt
        //to use the if else short have (ternary operator)

        //USING THE TERNARY OPERATOR

        String resultNumber3 = "ZERO";

        String result = number == 0  ? resultNumber3 : number == 1 ? resultNumber3 = "ONE"
                : number == 2 ? resultNumber3 = "TWO" : number == 3 ? resultNumber3 = "THREE"
                : number == 4 ? resultNumber3 = "FOUR" : number == 5 ? resultNumber3 = "FIVE"
                : number == 6 ? resultNumber3 = "SIX" : number == 7 ? resultNumber3 = "SEVEN"
                : number == 8 ? resultNumber3 = "EIGHT" : number == 9 ? resultNumber3 = "NINE"
                : "OTHER";

        System.out.println(result);
        //PHEW!!! It really looks neat. I like it. Say Baeldung to the rescue again
        //https://www.baeldung.com/java-ternary-operator

    }
}

//All algorithm give the same result. Cool!!!