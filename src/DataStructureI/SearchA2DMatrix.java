package DataStructureI;

import java.util.Arrays;

/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 */
public class SearchA2DMatrix {
    public static void main(String[] args) {

    }


    public boolean searchMatrix(int[][] matrix, int target) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).anyMatch(number -> number == target);
    }
}
