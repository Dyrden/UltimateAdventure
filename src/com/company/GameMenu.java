package com.company;

import java.util.Scanner;

public class GameMenu {


    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        do {
            System.out.println("""
                            ULTIMATE ADVENTURE
                                 'play'
                             to start a game
                                
                                 'exit'
                             to stop the game
                    """);
        } while(new GameMenu().run());
    }

    private boolean run() {
        switch (sc.nextLine().toLowerCase()) {
            case "play" -> new Adventure().run();
            case "exit" -> {return false;}
        }
        return true;
    }


}
