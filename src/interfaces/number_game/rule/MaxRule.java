package interfaces.number_game.rule;

public class MaxRule implements GameRule {

    @Override
    public int calculateResult(int[] input) {
        int max = 0;
        for (int i : input) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // This rule returns an item with max value present in the input array.
    public String toString() {
        return "MaxRule";
    }
}
