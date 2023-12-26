package interfaces.number_game;

import interfaces.number_game.rule.GameRule;

public class Player {
    private int[] values;

    public Player(int[] values) {
        this.values = values;
    }

    // ***************
    // Implement this method
    // find the rule that produces the largest result.
    public GameRule findBest(GameRule[] rules) {
        int bestValue = 0;
        GameRule bestRule = null;
        for (GameRule r : rules) {
            int tmpVal = r.calculateResult(values);
            if (tmpVal > bestValue) {
                bestValue = tmpVal;
                bestRule = r;
            }
        }
        return bestRule;
    }

}
