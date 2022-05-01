package app;

import java.util.Scanner;

public class App {

    static board tictactoe = new board();
    public static void main(String[] args) throws Exception {
        System.out.println("\n.....TicTacToe Game.....");
        
        Scanner s = new Scanner(System.in) ;
        System.out.println ("\nWho do you want to play against? \n" +
                            "  c - to play against computer\n" + 
                            "  h - to play against another human") ;
        String k = s.nextLine() ;

        player p1 = new humanplayer(tictactoe);
        player p2 ;
        if (k.equals("c")) {
            p2 = new computerplayer(tictactoe);
        }
        else { // if k == "h"
            p2 = new humanplayer(tictactoe);
        }
        
        tictactoe.printboard();

        game g = new game(p1, p2, tictactoe);

        System.out.println(g.playgame());

    }

}