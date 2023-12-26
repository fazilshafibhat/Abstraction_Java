package interfaces.number_game.rule;

public class AdditionRule implements GameRule {
    @Override
    public int calculateResult(int[] input) {
        int result = 0;
        for (int i : input) {
            result = result + i;
        }
        return result;

    }

    public String toString() {
        return "AdditionRule";
    }

}
