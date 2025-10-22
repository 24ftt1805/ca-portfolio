import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        
        boolean gameRunning = true;
        
        while (gameRunning) {
            for (int i = 0; i < 3; i++) {
                System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                if (i < 2) {
                    System.out.println("---------");
                }
            }
        
            System.out.println();
            System.out.println("Player's turn");
            int row, col;
            boolean validMove = false;
            
            while (!validMove) {
                System.out.print("Enter a row (0,1 or 2): ");
                row = scanner.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                col = scanner.nextInt();
                
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = 'X';
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }
            
            boolean playerWon = false;
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                    playerWon = true;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == 'X' && board[1][j] == 'X' && board[2][j] == 'X') {
                    playerWon = true;
                }
            }
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                playerWon = true;
            }
            if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                playerWon = true;
            }
            
            if (playerWon) {
                System.out.println();
                System.out.println("Game ended, Player Win");
                for (int i = 0; i < 3; i++) {
                    System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                    if (i < 2) {
                        System.out.println("---------");
                    }
                }
                break;
            }
            
            boolean boardFull = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        boardFull = false;
                    }
                }
            }
            if (boardFull) {
                System.out.println("Game ended, Tie");
                for (int i = 0; i < 3; i++) {
                    System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                    if (i < 2) {
                        System.out.println("---------");
                    }
                }
                break;
            }
            
            System.out.println();
            boolean computerMoved = false;
            while (!computerMoved) {
                int compRow = (int)(Math.random() * 3);
                int compCol = (int)(Math.random() * 3);
                if (board[compRow][compCol] == ' ') {
                    board[compRow][compCol] = 'O';
                    computerMoved = true;
                }
            }
            
            boolean computerWon = false;
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                    computerWon = true;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] == 'O') {
                    computerWon = true;
                }
            }
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                computerWon = true;
            }
            if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                computerWon = true;
            }
            
            if (computerWon) {
                System.out.println("Game ended, CPU Win");
                for (int i = 0; i < 3; i++) {
                    System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                    if (i < 2) {
                        System.out.println("---------");
                    }
                }
                break;
            }
            
            boardFull = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        boardFull = false;
                    }
                }
            }
            if (boardFull) {
                System.out.println("Game ended, Tie");
                for (int i = 0; i < 3; i++) {
                    System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
                    if (i < 2) {
                        System.out.println("---------");
                    }
                }
                break;
            }
        }
    }
}
