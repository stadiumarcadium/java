package lesson04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '•';
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static char[][] map;
    public static Scanner scanner;
    public static Random random;

    public TicTacToe() {
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while(true) {
            humanTurn();
            printMap();
            if (checkWin('X')) {
                System.out.println("Победил человек");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin('O')) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра закончена");
    }

    private static void initMap() {
        map = new char[5][5];

        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                map[i][j] = 8226;
            }
        }

    }

    private static void printMap() {
        int i;
        for(i = 0; i < 6; ++i) {
            System.out.print(i + " ");
        }

        System.out.println();

        for(i = 0; i < 5; ++i) {
            System.out.print(i + 1 + " ");

            for(int j = 0; j < 5; ++j) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void humanTurn() {
        int row;
        int col;
        do {
            System.out.println("Введите координаты в формате X Y");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while(!validTurn(row, col));

        map[row][col] = 'X';
    }

    public static boolean validTurn(int row, int col) {
        if (row >= 0 && row <= 5 && col >= 0 && col <= 5) {
            return map[row][col] == 8226;
        } else {
            return false;
        }
    }

    public static void aiTurn() {
        int[] turn = getWinTurn('O');
        if (turn[0] == -1) {
            turn = getWinTurn('X');
            if (turn[0] == -1) {
                do {
                    turn[0] = random.nextInt(5);
                    turn[1] = random.nextInt(5);
                } while(!validTurn(turn[0], turn[1]));
            }
        }

        System.out.println(Arrays.toString(turn));
        map[turn[0]][turn[1]] = 'O';
    }

    public static boolean isMapFull() {
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                if (map[i][j] == 8226) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkWin(char symb) {
        return checkRowWin(symb) || checkDiagonalWin(symb);
    }

    private static boolean checkRowWin(char symb) {
        for(int i = 0; i < 5; ++i) {
            int row = 0;
            int col = 0;

            for(int j = 0; j < 5; ++j) {
                row = map[i][j] == symb ? row + 1 : 0;
                col = map[j][i] == symb ? col + 1 : 0;
                if (row == 4 || col == 4) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean checkDiagonalWin(char symb) {
        int diag1 = 0;
        int diag2 = 0;

        for(int i = 0; i < 5; ++i) {
            diag1 = map[i][i] == symb ? diag1 + 1 : 0;
            diag2 = map[i][5 - i - 1] == symb ? diag2 + 1 : 0;
            if (diag1 == 4 || diag2 == 4) {
                return true;
            }
        }

        return false;
    }

    private static int[] getWinTurn(char symb) {
        for(int row = 0; row < 5; ++row) {
            for(int col = 0; col < 5; ++col) {
                if (map[row][col] == 8226 && winMove(row, col, symb)) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static boolean winMove(int row, int col, char symb) {
        map[row][col] = symb;
        boolean result = checkWin(symb);
        map[row][col] = 8226;
        return result;
    }

    static {
        scanner = new Scanner(System.in);
        random = new Random();
    }
}
