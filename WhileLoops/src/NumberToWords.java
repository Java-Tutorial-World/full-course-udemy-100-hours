public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        System.out.println( getDigitCount(123));
        System.out.println(reverse(1234));

    }

    public static void numberToWords (int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
//        int lastdigit = 0;
//        int randomNumber = 1;

        for (int i = 0; i < getDigitCount(number); i++){

            switch (reverseNumber % 10 ){
                case 0 -> System.out.print("Zero ") ;
                case 1 -> System.out.print("One ") ;
                case 2 -> System.out.print("Two ") ;
                case 3 -> System.out.print("Three ") ;
                case 4 -> System.out.print("Four ") ;
                case 5 -> System.out.print("Five ") ;
                case 6 -> System.out.print("Six ") ;
                case 7 -> System.out.print("Seven ") ;
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> System.out.print("Invalid Value");
            }
            reverseNumber /= 10;
        }
        System.out.println();
    }

    public static int reverse (int number ){
        int reverseNumber = 0;

        while (number != 0){
            reverseNumber = (reverseNumber * 10 ) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }

        int counter = 1;
        while (number > 9){
            number /= 10;
            counter ++;
        }
        return counter;
    }
}


//honestly, I did not do this in its entirety. 80% was a copied work. only numberToWords metho was done by me