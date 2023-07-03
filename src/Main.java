import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tic-Tac-Toe");
        char[][] ticTacToeBoard = new char[3][3];

        //newBoard(ticTacToeBoard);
        board(ticTacToeBoard);
        playingGame(ticTacToeBoard);

    }

    private static void newBoard(char[][] ticTacToeBoard) {
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                ticTacToeBoard[i][j] = ' ';
            }
        }
    }
    private static void board(char[][] ticTacToeBoard) {
        System.out.println("     A     B     C");
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            System.out.print((i + 1) + "    " +ticTacToeBoard[i][0] + "  |  ");
            System.out.print(ticTacToeBoard[i][1] + "  |  ");
            System.out.print(ticTacToeBoard[i][2]);
            System.out.println();
            if (i != 2) {
                System.out.println("   ----------------");
            }
        }
    }

    private static void playingGame(char[][] ticTacToeBoard) {
        Scanner input = new Scanner(System.in);
        boolean winCondition = false;
        int i = 1;
        char whosGoing;
        while (i < 10 && !winCondition) {
            if (i % 2 == 0) {
                whosGoing = 'X';
            } else {
                whosGoing = 'O';
            }
            System.out.println("Choose which box where you want to place your " + whosGoing +". Put in letter first, then number ie. A3.");
            String block = input.nextLine();
            block = block.toUpperCase();
            if (block.charAt(0) == 'A') {
                if (block.charAt(1) == '1') {
                    ticTacToeBoard[0][0] = whosGoing;
                    board(ticTacToeBoard);
                } else if (block.charAt(1) == '2') {
                    ticTacToeBoard[1][0] = whosGoing;
                    board(ticTacToeBoard);
                } else if (block.charAt(1) == '3') {
                    ticTacToeBoard[2][0] = whosGoing;
                    board(ticTacToeBoard);
                } else {
                    System.out.println("Not a choice. Choose again");
                    board(ticTacToeBoard);
                }
            } else if (block.charAt(0) == 'B') {
                if (block.charAt(1) == '1') {
                    ticTacToeBoard[0][1] = whosGoing;
                    board(ticTacToeBoard);
                } else if (block.charAt(1) == '2') {
                    ticTacToeBoard[1][1] = whosGoing;
                    board(ticTacToeBoard);
                } else if (block.charAt(1) == '3') {
                    ticTacToeBoard[2][1] = whosGoing;
                    board(ticTacToeBoard);
                } else {
                    System.out.println("Not a choice. Choose again");
                    board(ticTacToeBoard);
                }
            } else if (block.charAt(0) == 'C') {
                if (block.charAt(1) == '1') {
                    ticTacToeBoard[0][2] = whosGoing;
                    board(ticTacToeBoard);
                } else if (block.charAt(1) == '2') {
                    ticTacToeBoard[1][2] = whosGoing;
                    board(ticTacToeBoard);
                } else if (block.charAt(1) == '3') {
                    ticTacToeBoard[2][2] = whosGoing;
                    board(ticTacToeBoard);
                } else {
                    System.out.println("Not a choice. Choose again");
                    board(ticTacToeBoard);
                }
            } else {
                System.out.println("Not a choice. Choose again");
                board(ticTacToeBoard);
            }
            i++;
            winCondition = playerWon(ticTacToeBoard);
            if (i == 10) {
                System.out.println("It's a tie");
            }
            System.out.println();
        }
    }

    private static boolean playerWon(char[][] ticTacToeBoard) {
        //letters in second box
        if (ticTacToeBoard[0][0] == 'X' && ticTacToeBoard[1][0] == 'X' && ticTacToeBoard[2][0] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        } else if (ticTacToeBoard[0][0] == 'O' && ticTacToeBoard[1][0] == 'O' && ticTacToeBoard[2][0] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else if (ticTacToeBoard[0][1] == 'X' && ticTacToeBoard[1][1] == 'X' && ticTacToeBoard[2][1] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        }  else if (ticTacToeBoard[0][1] == 'O' && ticTacToeBoard[1][1] == 'O' && ticTacToeBoard[2][1] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else if (ticTacToeBoard[0][2] == 'X' && ticTacToeBoard[1][2] == 'X' && ticTacToeBoard[2][2] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        }  else if (ticTacToeBoard[0][2] == 'O' && ticTacToeBoard[1][2] == 'O' && ticTacToeBoard[2][2] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else if (ticTacToeBoard[0][0] == 'X' && ticTacToeBoard[0][1] == 'X' && ticTacToeBoard[0][2] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        }  else if (ticTacToeBoard[0][0] == 'O' && ticTacToeBoard[0][1] == 'O' && ticTacToeBoard[0][2] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else if (ticTacToeBoard[1][0] == 'X' && ticTacToeBoard[1][1] == 'X' && ticTacToeBoard[1][2] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        }  else if (ticTacToeBoard[1][0] == 'O' && ticTacToeBoard[1][1] == 'O' && ticTacToeBoard[1][2] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else if (ticTacToeBoard[2][0] == 'X' && ticTacToeBoard[2][1] == 'X' && ticTacToeBoard[2][2] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        }  else if (ticTacToeBoard[2][0] == 'O' && ticTacToeBoard[2][1] == 'O' && ticTacToeBoard[2][2] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else if (ticTacToeBoard[0][0] == 'X' && ticTacToeBoard[1][1] == 'X' && ticTacToeBoard[2][2] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        }  else if (ticTacToeBoard[0][0] == 'O' && ticTacToeBoard[1][1] == 'O' && ticTacToeBoard[2][2] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else if (ticTacToeBoard[2][0] == 'X' && ticTacToeBoard[1][1] == 'X' && ticTacToeBoard[0][2] == 'X') {
            System.out.println("Congrats! X won");
            return true;
        }  else if (ticTacToeBoard[2][0] == 'O' && ticTacToeBoard[1][1] == 'O' && ticTacToeBoard[0][2] == 'O') {
            System.out.println("Congrats! O won");
            return true;
        } else {
            return false;
        }
    }
}
