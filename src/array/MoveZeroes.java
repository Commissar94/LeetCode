package array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0});
    }

    public static void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            if (nums[i] == 0) {
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] != 0 && nums[i + 1] != 0 && nums[i] == 0 ||
                    nums[i - 1] == 0 && nums[i] != 0) {
                System.out.println("les go");
                moveZeroes(nums);
            }
        }
    }
}

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */