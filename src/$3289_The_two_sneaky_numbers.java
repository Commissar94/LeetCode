/*
In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.

As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.

Example 1:

Input: nums = [0,1,1,0]

Output: [0,1]

Explanation:

The numbers 0 and 1 each appear twice in the array.
 */

import java.util.Arrays;
import java.util.HashSet;

public class $3289_The_two_sneaky_numbers {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0, 1, 1, 0})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{0,3,2,1,3,2})));
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{7,1,5,4,3,4,6,0,9,5,8,2})));
    }

    public static int[] getSneakyNumbers(int[] nums) {

        int[] output = new int[nums.length];

        HashSet<Integer> uniqNums = new HashSet<>();
        int repeats = 0;

        for (int num : nums) {
            if (uniqNums.contains(num)) {
                output[repeats] = num;
                repeats++;
            } else {
                uniqNums.add(num);
            }
        }

        return Arrays.copyOfRange(output,0, output.length - (output.length - repeats));
    }
}
