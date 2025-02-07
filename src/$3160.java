/*
You are given an integer limit and a 2D array queries of size n x 2.

There are limit + 1 balls with distinct labels in the range [0, limit]. Initially, all balls are uncolored. For every query in queries that is of the form [x, y], you mark ball x with the color y. After each query, you need to find the number of distinct colors among the balls.

Return an array result of length n, where result[i] denotes the number of distinct colors after ith query.

Note that when answering a query, lack of a color will not be considered as a color.
 */

import java.util.*;

public class $3160 {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(queryResults(4, new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}})));
        System.out.println(Arrays.toString(queryResults(4, new int[][]{{0, 1}, {1, 2}, {2, 2}, {3, 4},{4,5}})));
    }


    public static int[] queryResults(int limit, int[][] queries) {

        int[] output = new int[queries.length];
        Map<Integer, Integer> currentColoredBalls = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();
        int uniqueColors = 0;

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];

            if (currentColoredBalls.containsKey(ball)) {
                int oldColor = currentColoredBalls.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    uniqueColors--;
                }
            }

            currentColoredBalls.put(ball, newColor);
            colorCount.put(newColor, colorCount.getOrDefault(newColor, 0) + 1);

            if (colorCount.get(newColor) == 1) {
                uniqueColors++;
            }

            output[i] = uniqueColors;
        }

        return output;
    }
}
