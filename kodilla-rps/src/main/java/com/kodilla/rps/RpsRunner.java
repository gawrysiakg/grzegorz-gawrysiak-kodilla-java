package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

    GameDialogs gameDialogs = new GameDialogs();
    GameLogic gamelogic = new GameLogic();

    gameDialogs.setUserName();
    gameDialogs.setNumberOfRound();
    GameDialogs.gameInstruction();
    gamelogic.gameDuration();

    }
}
