package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Adventure {

    public Adventure() {
        this.player = new Player(100, 2);
        this.enemies = new ArrayList<>();
    }

    private final Scanner keyboard = new Scanner(System.in);
    private final Player player;
    private final ArrayList<Enemy> enemies;
    private boolean gameRunning = true;
    private boolean playersTurn = true;


    public void run() {
        System.out.println("intro");
        while (gameRunning) {

            while (playersTurn) {
                commands(keyboard.nextLine().toLowerCase().split(" ", 2));
            }

            enemiesTurns();


        }
        System.out.println("Outro");
    }


    private boolean commands(String[] input) {
        switch (input[0]) {
            case "help" -> System.out.println("help");
            case "exit" -> {
                playersTurn = false;
                gameRunning = false;
            }

            default -> System.out.println("No such command");
        }

        return true;
    }





    private void enemiesTurns(){
        for (Enemy enemy : enemies) {
            //do something
        }
    }
}
