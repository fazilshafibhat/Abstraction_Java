package interfaces.number_game;

import interfaces.number_game.rule.AdditionRule;
import interfaces.number_game.rule.GameRule;
import interfaces.number_game.rule.MaxRule;
import interfaces.number_game.rule.MultiplicationRule;
import interfaces.number_game.rule.SumCube;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[] { 91, 5, 50 };
        Player player = new Player(input);
        GameRule[] rules = new GameRule[] { new AdditionRule(), new MaxRule(), new MultiplicationRule(),
                new SumCube() };
        GameRule gameRule = player.findBest(rules);
        System.out.println(gameRule);
    }
}
