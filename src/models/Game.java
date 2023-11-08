package models;

import strategies.WinningStrategy;

import java.util.List;

public class Game {

    private List<Player> players;

    private Board board;

    private List<WinningStrategy> winningStrategyList;

    private int nextMovePlayerIndex;

    private Player winner;

    private GameState gameState;

}
