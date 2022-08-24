package com.kodilla.rps;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameDialogs {
   //GameLogic gameLogic2 = new GameLogic();
    private static String userName;
    private static int numberOfRound ;


    public String getUserName() {
        return userName;
    }
    public int getNumberOfRound() {
        return numberOfRound;
    }

    public String setUserName() {
        System.out.println("Welcome in Rock-Paper-Scissors Game");
        System.out.println("Enter your name and press ENTER");
        Scanner scannedUserName = new Scanner(System.in);
        userName = scannedUserName.next();
        this.userName=userName;
        System.out.println("Good luck " + userName + "!");
        return userName;
    }

    public int setNumberOfRound() {
        System.out.println("Enter amount of rounds required to win and press Enter:");
        Scanner scannedNumberOfRound = new Scanner(System.in);
        numberOfRound = scannedNumberOfRound.nextInt();
        return numberOfRound;
    }

    public static void gameInstruction() {
        System.out.println("Hello "+userName+". Rules of the game: ");
        System.out.println("Press [1] to choose Rock \nPress [2] to choose Paper\nPress [3] to choose Scissors");
        System.out.println("Press [X] to end the game\nPress [N] to start a new game\nPress [R] to display rules");
        System.out.println("Scissors cuts paper, paper covers rock and rock crushes scissors.");
        System.out.println("Player who win "+numberOfRound+" rounds is a WINNER!");
        System.out.println("Good luck!");
    }




}
