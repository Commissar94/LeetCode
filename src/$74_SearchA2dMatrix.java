/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */


public class $74_SearchA2dMatrix {

    public static void main(String[] args) {

        int[][] testData = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println(searchMatrix(testData, 60));
         System.out.println(searchMatrix(testData, 20));
         System.out.println(searchMatrix(testData, 7));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length - 1;
        int rowsLength = matrix[0].length - 1;

        int matrix_start = 0;
        int matrix_end = rows;
        int matrix_mid = (matrix_start + matrix_end) / 2;

        while (matrix_start <= matrix_end) {

            if (matrix[matrix_mid][0] > target) {
                matrix_end = matrix_mid - 1;
            } else if (matrix[matrix_mid][rowsLength] < target) {
                matrix_start = matrix_mid + 1;
            } else {
                int row_start = 0;
                int row_end = rowsLength;
                int row_mid = (row_start + row_end) / 2;

                while (row_start <= row_end) {
                    if (matrix[matrix_mid][row_mid] == target) {
                        return true;
                    } else if (matrix[matrix_mid][row_mid] < target) {
                        row_start = row_mid + 1;
                    } else if (matrix[matrix_mid][row_mid] > target) {
                        row_end = row_mid - 1;
                    }
                    row_mid = (row_start + row_end) / 2;
                }
                return false;
            }
            matrix_mid = (matrix_start + matrix_end) / 2;
        }


        return false;
    }

}
