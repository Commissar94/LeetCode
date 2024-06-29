/*
You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.

Return the minimum number of operations to make all elements of nums divisible by 3.
 */

public class $3190_FindMinimumOperationsToMakeAllElementsDivisibleByThree {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 2, 3, 4}));
        System.out.println(minimumOperations(new int[]{3, 6, 9}));
    }

    public static int minimumOperations(int[] nums) {

        int counter = 0;
        for (int num : nums) {
            if (num % 3 != 0) counter++;
        }

        return counter;
    }
}