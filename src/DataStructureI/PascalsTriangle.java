package DataStructureI;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        System.out.println(generate(7));

        System.out.println(Math.pow(2, 0));

    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> output = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> tempList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) tempList.add(1);
                else {
                    List<Integer> upperList = output.get(output.size() - 1);
                    int sumOfTwoNumsFromUpList = upperList.get(j - 1) + upperList.get(j-2);
                    tempList.add(sumOfTwoNumsFromUpList);
                }
            }
            output.add(tempList);
        }
        return output;
    }
}
