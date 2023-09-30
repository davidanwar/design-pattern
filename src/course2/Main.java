package course2;

import course2.controller.ScoreBoard;
import course2.model.Balloon;
import course2.model.Clown;
import course2.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Balloon Taps Score");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.println("Clown Taps Score");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.println("Square Balloon Taps Score");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
