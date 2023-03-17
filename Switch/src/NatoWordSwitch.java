public class NatoWordSwitch {

    public static void main(String[] args) {
        System.out.println(natoLetter('u'));

    }

    public static String natoLetter (char letters){


//        switch (letters){
//            case 'a':
//                return  "Able";
//
//            case 'b':
//                return  "Baker";
//
//            case 'c':
//                return  "Charlie";
//
//            case 'd':
//                return  "Dog";
//
//            case 'e':
//                return  "Easy";
//
//        }return "Letter not between A and E";

        return switch (letters){
            case 'a' -> "Able"; case 'b' -> "Baker";case 'c' -> "Charlie"; case 'd' -> "Dog"; case 'e' -> "Easy";

            default ->  "Letter '" + letters + "' not between A and E";
        };
    }
}
