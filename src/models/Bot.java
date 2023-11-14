package models;

import strategies.BotPlayingStrategy;

public class Bot extends Player {

    private BotDifficultyLevel botDifficultyLevel;

    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Long id, String name, Symbol symbol, BotPlayingStrategy botPlayingStrategy) {
        super(id, name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = getBotDifficultyLevel();
        // TODO: this.botPlayingStrategy = add a factory
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
