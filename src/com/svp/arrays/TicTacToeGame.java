package com.svp.arrays;
import java.util.*;


public class TicTacToeGame {
    public static void main(String[] args) {
        //set board which empty
        char[][] board = new char[3][3];
        for(int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while(!gameOver){
            diplayBoard(board);
            System.out.print("Player " + player + " enter: ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            System.out.println();

            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = hasWon(board,player);

                if(gameOver){
                    System.out.print("Player " + player + " has victory");
                }

                else{
                    if(player == 'X'){
                        player = 'O';
                    }

                    else{
                        player = 'X';
                    }
                }
            }
            else{
                System.out.println("Invalid move!!....Try Again");
            }
        }
        diplayBoard(board);
    }

    public static boolean hasWon(char[][] board, char player){
        //verify rows
        for(int row = 0; row < board.length; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        //verify columns
        for(int col = 0; col < board[0].length; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        //verify left diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        //verify right diagonal
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    public static void diplayBoard(char[][] board){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}