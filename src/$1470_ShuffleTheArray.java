/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

import java.util.Arrays;

public class $1470_ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        System.out.println(Arrays.toString(shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] output = new int[n * 2];

        for (int i = 0; i < nums.length / 2; i++) {
            output[i + i] = nums[i];
            output[i + i + 1] = nums[i + n];
        }

        return output;
    }
}
