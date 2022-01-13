package array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(arr));
    }


    public static boolean isValidSudoku(char[][] board) {

        Set<Character> cols = new HashSet<>();
        Set<Character> rows = new HashSet<>();
        Set<Character> boxes = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (cols.contains(board[i][j]) && board[i][j] != '.') return false;
                if (rows.contains(board[j][i]) && board[j][i] != '.') return false;
                rows.add(board[j][i]);
                cols.add(board[i][j]);
            }
            cols.clear();
            rows.clear();
        }

        int counter = 0;
        int times = 0;
        while (times < 9) {
            while (counter < 9) {
                for (int i = counter; i < 3 + counter; i++) {
                    for (int j = times; j < 3 + times; j++) {
                        if (boxes.contains(board[i][j]) && board[i][j] != '.') return false;
                        boxes.add(board[i][j]);
                    }
                }
                boxes.clear();
                counter += 3;
            }
            counter = 0;
            times += 3;
        }
        return true;
    }
}

/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 */