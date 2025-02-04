/*
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.
 */

public class $1800_Maximum_Ascending_Subarray_Sum {

    public static void main(String[] args) {

        System.out.println(maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}));
        System.out.println(maxAscendingSum(new int[]{10,20,30,40,50}));
        System.out.println(maxAscendingSum(new int[]{12,17,15,13,10,11,12}));
        System.out.println(maxAscendingSum(new int[]{100,10,1}));
    }

    public static int maxAscendingSum(int[] nums) {

        if (nums.length == 1) return nums[0];

        int maxAscSum = nums[0];
        int curAscSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i-1] < nums[i]) curAscSum += nums[i];
            else {
                curAscSum = nums[i];
            }
            if (curAscSum > maxAscSum) maxAscSum = curAscSum;

        }
        return maxAscSum;
    }
}
