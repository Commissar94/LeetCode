package DataStructureI;


/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
 */
public class Maximum_Subarray {

    public static void main(String[] args) {

        int[] nums1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = new int[]{5, 4, -1, 7, 8};
        int[] nums3 = new int[]{-2, 1};
        int[] nums4 = new int[]{1};
        int[] nums5 = new int[]{1, 2};
        int[] nums6 = new int[]{-2, -3, 1};
        int[] nums7 = new int[]{-1, 0, -2};
        int[] nums8 = new int[]{8, -19, 5, -4, 20};
        int[] nums9 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums10 = new int[]{-2,-1,-3,-4,-1,-2,-1,-5,-4};

        System.out.println(maxSubArray(nums10));

    }

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int number : nums) {
            currentSum += number;
            max = Math.max(max, currentSum);
            if (currentSum < 0) currentSum = 0;
        }

        return max;
    }
}
