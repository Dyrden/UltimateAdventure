package com.company;

import java.util.Scanner;

public class GameMenu {


    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        while(new GameMenu().run());
    }

    private boolean run() {
        switch (sc.nextLine().toLowerCase()) {
            case "play" -> new Adventure().run();
            case "exit" -> {return false;}
        }
        return true;
    }


}
