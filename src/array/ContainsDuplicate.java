package array;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().toArray().length != nums.length;
    }
}
