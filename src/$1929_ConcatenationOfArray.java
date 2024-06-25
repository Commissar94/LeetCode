/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
 */
import java.util.Arrays;

public class $1929_ConcatenationOfArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,3,2,1})));


    }

    public static int[] getConcatenation(int[] nums) {

        int outputLength = nums.length * 2;

        int[] output = new int[outputLength];
        int counter = 0;

        while (counter < outputLength){
            for (int num : nums) {
                output[counter] = num;
                counter++;
            }
        }

        return output;
    }
}
