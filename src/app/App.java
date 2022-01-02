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

    /*
        while (tictactoe.checkwin() == false){

            //Human Play
            int a = p1.askformove();
            tictactoe.setsquare(a, 'X');
            tictactoe.printboard();
            if (tictactoe.checkwin()){
                System.out.println(" 'X' Wins!");
                break;
            } else if (tictactoe.checkdraw()) {
                System.out.println("Draw!");
                break;
            }
           
            //ComputerPlay
            int n = p2.askformove();
            tictactoe.setsquare(n, 'O');
            tictactoe.printboard();
            if (tictactoe.checkwin()){
                System.out.println(" 'O' Wins!");
                break;
            } else if (tictactoe.checkdraw()) {
                System.out.println("Draw!");
                break;
            }

        }
    */

    }

}
