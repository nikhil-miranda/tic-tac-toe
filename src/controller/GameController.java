package controller;

import models.*;
import strategies.*;
import exceptions.*;

import java.util.List;

public class GameController {  // expected to be stateless

    public Game startGame(int dimensions, List<Player> players, List<WinningStrategy> winningStrategies)
            throws DuplicateSymbolException, PlayersCountDimensionMismatchException, MoreThanOneBotException {
        return Game.getBuilder()
                .setDimension(dimensions)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

}
