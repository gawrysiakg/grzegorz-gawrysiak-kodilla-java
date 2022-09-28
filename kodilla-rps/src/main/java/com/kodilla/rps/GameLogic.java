package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private boolean end = false;
    private int playerPoints;
    private int computerPoints;
    private String computerMove;
    private String playerMove;
    private String userName;
    private int numberOfRound ;
   // private int round = 1;

    public String getUserName() {
        return userName;
    }
    public int getNumberOfRound() {
        return numberOfRound;
    }


    public String getComputerMove() {
        Random random = new Random();
        //String computerMove;
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
            case "X" -> this.quitGame();
            case "N" -> gameDuration();
            case "R" -> this.gameInstruction();
        }
        return playerMove;
    }


    public boolean quitGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quit the game? y/n");
        String yesOrNo = scanner.next();
        if (yesOrNo.equals("y")) {
            end = true;
            System.out.println(getUserName() + " Thank you for playing.");
            System.exit(0);
        } else {
            end = false;
            setUserName();
            setNumberOfRound();
            gameInstruction();
            gameDuration();
        }
        return end;
    }


    public void gameDuration() {
        playerPoints = 0;
        computerPoints = 0;
        int round = 1;

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

            if (playerPoints == getNumberOfRound()) {
                System.out.println(getUserName() + " WIN! ");
                end = true;
                quitGame();
            } else if (computerPoints == getNumberOfRound()) {
                System.out.println("Computer WIN! ");
                end = true;
                quitGame();
            } else {
                end = false;
            }
        }
    }

    public void score(){
        System.out.println("Score: ");
        System.out.println(getUserName()+": "+playerPoints+", Computer: "+computerPoints);
    }
    public String setUserName() {
        System.out.println("Welcome in Rock-Paper-Scissors Game");
        System.out.println("Enter your name and press ENTER");
        Scanner scannedUserName = new Scanner(System.in);
        userName = scannedUserName.next();
        System.out.println("Good luck " + userName + "!");
        return userName;
    }
    public int setNumberOfRound() {
        System.out.println("Enter amount of rounds required to win and press Enter:");
        Scanner scannedNumberOfRound = new Scanner(System.in);
        numberOfRound = scannedNumberOfRound.nextInt();
        return numberOfRound;
    }
    public void gameInstruction() {
        System.out.println("Hello "+userName+". Rules of the game: ");
        System.out.println("Press [1] to choose Rock \nPress [2] to choose Paper\nPress [3] to choose Scissors");
        System.out.println("Press [X] to end the game\nPress [N] to start a new game\nPress [R] to display rules");
        System.out.println("Scissors cuts paper, paper covers rock and rock crushes scissors.");
        System.out.println("Player who win "+numberOfRound+" rounds is a WINNER!");
        System.out.println("Good luck!");
    }
}