package interfaces.number_game.rule;

public class SumCube implements GameRule {

    @Override
    public int calculateResult(int[] input) {
        int result = 0;
        for (int i : input) {
            result += (i * i * i);
        }
        return result;
    }

    public String toString() {
        return "SumCubeRule";
    }
}
