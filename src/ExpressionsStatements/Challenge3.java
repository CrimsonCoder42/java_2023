package ExpressionsStatements;

public class Challenge3 {

    public static void main(String[] args) {


        displayHighScorePosition("Devin", calculateHighScorePosition(1500));
        displayHighScorePosition("Devin", calculateHighScorePosition(1000));
        displayHighScorePosition("Devin", calculateHighScorePosition(500));
        displayHighScorePosition("Devin", calculateHighScorePosition(100));
        displayHighScorePosition("Devin", calculateHighScorePosition(25));


    }

    public static void displayHighScorePosition(String playerName, int playerPosition ) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");

    }

    public static int calculateHighScorePosition(int playerScore) {
        int scoreResult = 4;

        if(playerScore >= 1000){
            scoreResult = 1;
        } else if(playerScore >= 500) {
            scoreResult = 2;
        } else if(playerScore >= 100) {
            scoreResult = 3;
        }
        return scoreResult;

    }

}
