package at.fw.basics;

import java.util.Scanner;

public class tictactoe {

    // Funktion zum Drucken des TicTacToe-Bretts
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " | ");
            }
            System.out.println("\n---------");
        }
    }

    // Funktion zum Überprüfen, ob ein Spieler gewonnen hat
    public static boolean checkWinner(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    // Hauptfunktion für das TicTacToe-Spiel
    public static void ticTacToe() {
        char[][] board = new char[3][3]; // Erstellt ein leeres 3x3 TicTacToe-Brett

        // Initialisiert das Brett mit Leerzeichen
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        char currentPlayer = 'X'; // Setzt den Startspieler auf 'X'

        Scanner scanner = new Scanner(System.in);

        // Schleife für den Spielablauf
        while (true) {
            printBoard(board); // Druckt das aktuelle Brett

            // Spieler gibt den Zug ein
            System.out.print("Player " + currentPlayer + ", enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Player " + currentPlayer + ", enter column (0-2): ");
            int col = scanner.nextInt();

            // Überprüft die Gültigkeit des Zuges und ob das Feld bereits belegt ist
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            board[row][col] = currentPlayer; // Setzt den Zug des Spielers auf das TicTacToe-Brett

            // Überprüft, ob ein Spieler gewonnen hat
            if (checkWinner(board, currentPlayer)) {
                printBoard(board); // Druckt das endgültige Brett
                System.out.println("Player " + currentPlayer + " wins!"); // Druckt die Siegesnachricht
                break; // Beendet das Spiel
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Wechselt den Spieler für den nächsten Zug
        }

        System.out.println("Thanks for playing!"); // Druckt eine Abschlussnachricht nach Spielende
        scanner.close();
    }

    public static void main(String[] args) {
        ticTacToe(); // Start des TicTacToe-Spiels
    }
}