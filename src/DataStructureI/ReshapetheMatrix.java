package DataStructureI;

/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 */

import java.util.Arrays;

public class ReshapetheMatrix {

    public static void main(String[] args) {

        int[][] test1 = {{1, 2}, {3, 4}};
        int[][] test2 = {{1, 2}, {3, 4}};

        System.out.println(Arrays.deepToString(matrixReshape(test1, 1, 4)));
        System.out.println(Arrays.deepToString(matrixReshape(test1, 2, 4)));
    }


    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        //if the product of rows & cols of mat matrix and the new matrix are not same then return original matrix
        if((rows * cols) != (r * c)) return mat;

        //Creating the new matrix
        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;


        //Traversing the mat matrix and storing the its values in new matrix output cols wise
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                output[output_rows][output_cols] = mat[i][j];
                output_cols++;

                //if the cols value reached then change the row and set the cols value to 0.
                if(output_cols == c)
                {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }

        return output;
    }
}
