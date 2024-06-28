/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

public class $1512_NumberOfGoodPairs {
    public static void main(String[] args) {

        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println(numIdenticalPairs(new int[]{1, 1}));
        System.out.println(numIdenticalPairs(new int[]{1, 1, 1, 1}));

    }

    public static int numIdenticalPairs(int[] nums) {

        int numberOfGoodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) numberOfGoodPairs++;
            }
        }

        return numberOfGoodPairs;
    }
}