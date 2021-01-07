package programingByDoing.arrays;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        char player1 = '0';
        char player2 = 'X';
        int turn = 1;

        initBoard();

        do {
            Scanner keyboard = new Scanner(System.in);
            if (turn % 2 != 0) {
                playerChoise(player1);
                turn++;
            } else {
                playerChoise(player2);
                turn++;
            }
            displayBoard();

            if ( winGame(player1) )
            {
                System.out.println( "'" + player1 + "' wins the game!" );
                break;
            }
            else if ( winGame(player2) )
            {
                System.out.println( "'" + player2 + "' wins the game!" );
                break;
            }
            else if ( turn > 9 )
            {
                System.out.println( "This game is a tie." );
                break;
            }

        } while (true);

    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }


    public static void displayBoard() {
        System.out.println("     " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("     " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("     " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public static void playerChoise(char player) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("\'" + player + "\', choose your location (row, column): ");
        int row = keyboard.nextInt();
        int column = keyboard.nextInt();

        board[row][column] = player;
    }

    public static boolean winGame( char player )
    {
        // check horizontal
        for ( int r = 0; r < 3; r++ )
        {
            if ( player == board[r][0] && board[r][0] == board[r][1] && board[r][1] == board[r][2] )
                return true;
        }

        // check vertical
        for ( int c = 0; c < 3; c++ )
        {
            if ( player == board[0][c] && board[0][c] == board[1][c] && board[1][c] == board[2][c] )
                return true;
        }

        // check diagonal
        if ( player == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2] )
            return true;
        else if ( player == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0] )
            return true;


        return false;
    }



}
