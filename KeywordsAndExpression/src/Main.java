public class Main {
    public static void main(String[] args) {

        checkNumber(-222);

        int highScore = calculateScore(true, 500, 8, 500);
        System.out.println("The high score is " + highScore);


        System.out.println( "The next high score is " + calculateScore(true, 1000, 8, 200)); ;

        int playersPosition = calculateHighScorePosition(1500);
        displayHighScorePosition( "Tim", playersPosition);

        playersPosition = calculateHighScorePosition(1000);
        displayHighScorePosition( "Tim", playersPosition);

        playersPosition = calculateHighScorePosition(500);
        displayHighScorePosition( "Tim", playersPosition);

        playersPosition = calculateHighScorePosition(100);
        displayHighScorePosition( "Tim", playersPosition);

        playersPosition = calculateHighScorePosition(25);
        displayHighScorePosition( "Tim", playersPosition);


    }

    public static  int  calculateScore (boolean gameOver, int myScore, int myLevelCompleted, int myBonus){


        int myFinalScore = myScore;
        if (gameOver) {
            myFinalScore += (myLevelCompleted * myBonus);
            myFinalScore += 1000;

        }
        return myFinalScore;
    }


    public static void displayHighScorePosition (String playersName, int playersPosition) {
        System.out.println( playersName + " managed to get into position " + playersPosition + " on the high score list");

    }

    public static int calculateHighScorePosition(int playersScore) {

        if (playersScore >= 1000){
            return 1;
        }else if (playersScore >= 500 ){
            return 2;
        }else if (playersScore >= 100 ){
            return 3;
        }
            return 4;

    }

    public static void checkNumber (int number) {

        System.out.println((number > 0 )? "positive" : (number < 0) ? "negative" : "zero");

        if ( number > 0 ){
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }else
            System.out.println("Zero");
    }
}