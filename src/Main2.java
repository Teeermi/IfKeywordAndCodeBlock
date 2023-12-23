public class Main2 {
    public static void main(String[] args) {
    boolean gameOver = true;
    int score = 10000;
    int levelCompleted = 8;
    int bonus = 200;
    int finalScore = 0;
    if (gameOver) {
        finalScore += score + (levelCompleted * bonus);
        System.out.println("twoj wynik " + finalScore);
    }
    }
}
