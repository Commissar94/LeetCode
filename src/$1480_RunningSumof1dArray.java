/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
 */


import java.util.Arrays;

public class $1480_RunningSumof1dArray {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3,4})));
    }


    public static int[] runningSum(int[] nums) {


        int[] output = nums.clone();
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            output[i] = output[i] + currentSum;
            currentSum = currentSum + nums[i];
        }
        return output;
    }
}

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
 */