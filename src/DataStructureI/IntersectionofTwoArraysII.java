package DataStructureI;


/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionofTwoArraysII {

    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> input1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> input2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        List<Integer> output = new ArrayList<>();

        for (
                Iterator<Integer> i = input1.iterator(); i.hasNext(); ) {
            Integer num1 = i.next();
            for (Iterator<Integer> j = input2.iterator(); j.hasNext(); ) {
                Integer num2 = j.next();
                if (Objects.equals(num1, num2)) {
                    output.add(num2);
                    j.remove();
                    break;
                }
            }
            i.remove();
        }

        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}