package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    GameDialogs gameDialogs = new GameDialogs();
    boolean end = false;
    int playerPoints ;
    int computerPoints;
    int round = 1;
    String computerMove;
    String playerMove;


    public String getComputerMove() {
        Random random = new Random();
        int cMove = random.nextInt(3) + 1;
        if (cMove == 1) {
            computerMove = "ROCK";
        } else if (cMove == 2) {
            computerMove = "PAPER";
        } else {
            computerMove = "SCISSORS";
        }
        return computerMove;
    }

    public String getPlayerMove() {
        Scanner s = new Scanner(System.in);
        String pMove = s.nextLine().toUpperCase();
        switch (pMove) {
            case "1" -> playerMove = "ROCK";
            case "2" -> playerMove = "PAPER";
            case "3" -> playerMove = "SCISSORS";
            case "X" -> quitGame();
           // case "N" -> gameDuration();
            case "R" -> GameDialogs.gameInstruction();
            default -> gameDuration();
        }
        return playerMove;
    }

    public boolean quitGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quit game? y/n");
        String yesOrNo = scanner.next();
        if (yesOrNo.equals("y")) {
            end = true;
            System.out.println(gameDialogs.getUserName() + " Thank you for playing, You win " + playerPoints + " times.");
            System.exit(0);
        } else {
            end = false;
            //gameDialogs.setUserName();
            gameDialogs.setNumberOfRound();
            GameDialogs.gameInstruction();
            gameDuration();
        }
        return end;
    }

    public void gameDuration() {

        while (!end) {

            System.out.println("\nGame " + round);
            System.out.println("Press [1] to choose Rock; Press [2] to choose Paper; Press [3] to choose Scissors;");
            System.out.println("Press [X] to end the game; Press [N] to start a new game; Press [R] to display rules;");
            System.out.println("Confirm by pressing Enter!");
            getPlayerMove();
            getComputerMove();
            if (playerMove.equals("ROCK") && computerMove.equals("PAPER")) {
                System.out.println("You: ROCK, Computer: PAPER, point for Computer! ");
                computerPoints++;
                round++;
            } else if (playerMove.equals("PAPER") && computerMove.equals("SCISSORS")) {
                System.out.println("You: PAPER, Computer: SCISSORS, point for Computer! ");
                computerPoints++;
                round++;
            } else if (playerMove.equals("SCISSORS") && computerMove.equals("ROCK")) {
                System.out.println("You: SCISSORS, Computer: ROCK, point for Computer! ");
                computerPoints++;
                round++;
            } else if (playerMove.equals("ROCK") && computerMove.equals("SCISSORS")) {
                System.out.println("You: ROCK, Computer: SCISSORS, point for You");
                playerPoints++;
                round++;
            } else if (playerMove.equals("PAPER") && computerMove.equals("ROCK")) {
                System.out.println("You: PAPER, Computer: ROCK, point for You");
                playerPoints++;
                round++;
            } else if (playerMove.equals("SCISSORS") && computerMove.equals("PAPER")) {
                System.out.println("You: SCISSORS, Computer: PAPER, point for You");
                playerPoints++;
                round++;
            } else {
                System.out.println("DRAW! " + playerMove + " : " + computerMove);
                round++;
            }

            score();

            checkTotalWinner();
        }
    }

    public void score() {
        System.out.println("Score: ");
        System.out.println(gameDialogs.getUserName()+": "+playerPoints+", Computer: "+computerPoints);
    }

    public void checkTotalWinner(){
        if (playerPoints == gameDialogs.getNumberOfRound()) {
            System.out.println("Total games: "+(round-1));
            System.out.println(gameDialogs.getUserName() + " is a WINNER!");
            end = true;
            quitGame();
        } else if (computerPoints == gameDialogs.getNumberOfRound()) {
            System.out.println("Total games: "+(round-1));
            System.out.println("Computer is a WINNER! ");
            end = true;
            quitGame();
        } else {
            end = false;
        }
    }

}