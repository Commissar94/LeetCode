/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
 */

public class $724_FindPivotIndex {

    public static void main(String[] args) {

        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6})); //28 - 11 = 17, 28 - 17 = 11
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{2, 1, -1})); //0

    }

    public static int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum = rightSum + num;
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum = nums[i] + leftSum;

            if (leftSum == rightSum) return i;
            rightSum = rightSum - nums[i];
        }

        return -1;
    }
}
