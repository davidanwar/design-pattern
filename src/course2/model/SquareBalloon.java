package course2.model;

import course2.controller.ScoreAlgorithmBase;

public class SquareBalloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
