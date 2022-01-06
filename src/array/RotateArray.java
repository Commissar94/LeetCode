package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {

    public static void main(String[] args) {

        RotateArray rotateArray = new RotateArray();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};

        rotateArray.rotate(array, 4);
    }

    public void rotate(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.rotate(list, k);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}
