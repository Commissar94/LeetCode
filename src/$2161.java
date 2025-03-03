import java.util.*;

public class $2161 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)));
        System.out.println(Arrays.toString(pivotArray(new int[]{-3,4,3,2}, -2)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {

        int[] output = new int[nums.length];
        int pointer = 0;

        for (int num : nums) {
            if (num < pivot) {
                output[pointer++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                output[pointer++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                output[pointer++] = num;
            }
        }

        return output;
    }
}
