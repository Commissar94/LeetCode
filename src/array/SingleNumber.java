package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2}; //((2^2)^(1^1)^(4)) => (0^0^4) => 4
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {

        int result = 0;
        for(int num: nums){
            result = result ^ num;
        }
        return result;

//        List<Integer> numsList = new ArrayList();
//        for (int num : nums) {
//            numsList.add(num);
//        }
//
//        return Arrays.stream(Arrays.stream(nums)
//                        .filter(num -> Collections.frequency(numsList, num) == 1)
//                        .toArray())
//                .findFirst()
//                .getAsInt();
    }
}
