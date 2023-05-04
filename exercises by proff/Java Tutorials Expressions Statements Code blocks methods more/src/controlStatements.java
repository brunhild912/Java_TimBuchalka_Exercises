public class controlStatements {
    public static void main( String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score + (levelCompleted * bonus);

        if (gameOver){
            System.out.println("Final Score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score + (levelCompleted * bonus);

        if (gameOver){
            System.out.println("Final Score was " + finalScore);
        }
    }
}

