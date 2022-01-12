package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {

        int[] array = new int[]{2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (int i = 0; i < nums.length; i++) {
            int guess = target - nums[i];
            if (list.contains(guess) && list.indexOf(guess) != i) {
                return new int[]{i, list.indexOf(guess)};
            }
        }
        return new int[1];
    }
}

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */