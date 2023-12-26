package interfaces.number_game.rule;

public class MultiplicationRule implements GameRule {

    // This rule multiplies all the items in the input array and returns the final
    // result.
    @Override
    public int calculateResult(int[] input) {
        int result = 0;
        for (int i : input) {
            result = result * i;
        }
        return result;
    }

    public String toString() {
        return "MultiplicationRule";
    }
}
