package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

    GameLogic logic = new GameLogic();

    logic.setUserName();
    logic.setNumberOfRound();
    logic.gameInstruction();
    logic.gameDuration();


    }
}
