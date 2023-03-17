public class WhileLoopExercise {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(11));

        int numberRange = 9;
        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;
        while ( numberRange >=5 && numberRange <= 20 ){
            numberRange++;
            if(isEvenNumber(numberRange) ){
                totalEvenNumbers ++;
                System.out.println( numberRange + " is even number");

            }else
            System.out.println(numberRange + " is not even number");
            totalOddNumbers ++;

            if ( totalEvenNumbers >5 ){
                break;
            }

            System.out.println(totalEvenNumbers + " is total of all even numbers");
            System.out.println(totalOddNumbers + " is total of all odd numbers");





        }
    }

    public static boolean isEvenNumber (int number){

        if ( number % 2 == 0){
            return true;
        }else
            return false;
    }
}
