public class methods {
    public static void main (String[] args) {
        calculateScore(true, 2000, 5, 200);
        calculateScore(false, 0, 2, 100);
        calculateScore(true, 800, 3, 50);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus ){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);

            if ((finalScore > 1000) || (finalScore > 500 && finalScore < 1000) || (finalScore > 100 && finalScore < 50)){
                calculateHighScorePosition (finalScore);
            }
        }
        return -1;
    }

    public static int calculateHighScorePosition (int finalScore){
        if (finalScore == 1500){
            return 1;
        }
        else if (finalScore == 900){
            return 2;
        }
        else if (finalScore == 400){
            return 3;
        }
        else if (finalScore == 50){
            return 4;
        }

        return -1;
    }

    public static void displayHighScorePosition (String playerName, int position){
        System.out.println (playerName + " managed to take position " + position + " on the high score table.");
    }
}
