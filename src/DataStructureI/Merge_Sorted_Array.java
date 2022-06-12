package DataStructureI;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        int[] nums3 = new int[]{1};
        int[] nums4 = new int[]{};

        merge(nums1, 3, nums2, 3);
        merge(nums3, 1, nums4, 0);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] combinedArray = new int[m + n];
        System.arraycopy(nums1, 0, combinedArray, 0, m);
        System.arraycopy(nums2, 0, combinedArray, m, n);

        List<Integer> list = Arrays
                .stream(combinedArray)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums1));
    }
}