package app;

public class App {

    static board tictactoe = new board();
    public static void main(String[] args) throws Exception {
        System.out.println("TicTacToe Game");
        
        player p1 = new humanplayer(tictactoe);
        player p2 = new computerplayer(tictactoe);

        tictactoe.printboard();

        game g = new game(p1, p2, tictactoe);

        System.out.println(g.playgame());

    }

}